package org.tensorflow.codelabs.objectdetection.ui.login

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.repository.AppRepository
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.di.Injection
import java.lang.Exception

class LoginViewmodel(private val appRepository: AppRepository, private val application: Application): ViewModel() {
    private val preferencesDataStoreHelper = PreferencesDataStoreHelper(application as Context)

    private val _linearProgressVisibility = MutableLiveData(false)
    val linearProgressVisibility: LiveData<Boolean> = _linearProgressVisibility

    private val _isLoggedin = MutableLiveData(false)
    val isLoggedin: LiveData<Boolean> = _isLoggedin

    fun login(identifier: String, password: String) {
        _linearProgressVisibility.value = true
        viewModelScope.launch {
            try {
                val response = appRepository.login(identifier,password)
                if(response.isSuccessful) {
                    if (response.body() != null) {
                        Log.d("loginResponseBody",response.body().toString())
                        preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.USER_ID,response.body()!!.user.id.toString())
                        preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.TOKEN, response.body()!!.jwt)
                        preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.USERNAME,response.body()!!.user.username)
                        preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.JOINED_AT,response.body()!!.user.createdAt)
                        preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.EMAIL,response.body()!!.user.email)
                        _linearProgressVisibility.value = false
                        _isLoggedin.value = true
                    }
                }else if(response.code() == 400){
                    _linearProgressVisibility.value = false
                    Toast.makeText(application as Context, "Wrong identifier or password",Toast.LENGTH_SHORT).show()
                }
            }
            catch (e: Exception) {
                Log.d("httpException123",e.toString())
                _linearProgressVisibility.value = false
                Toast.makeText(application as Context, "Login Failed please try again",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

class LoginViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideAuthRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(LoginViewmodel::class.java)) {
            LoginViewmodel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}


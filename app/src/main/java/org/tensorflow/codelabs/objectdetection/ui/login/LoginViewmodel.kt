package org.tensorflow.codelabs.objectdetection.ui.login

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.MainActivity
import org.tensorflow.codelabs.objectdetection.data.AppRepository
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
                val responseBody = appRepository.login(identifier,password)
                _linearProgressVisibility.value = false
                _isLoggedin.value = true
                Log.d("responseBody",responseBody.toString())
                preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.TOKEN, responseBody.jwt)

            }catch (e: Exception) {
                Log.d("error123","Error in login")
                _linearProgressVisibility.value = false
                _isLoggedin.value = false
                Toast.makeText(application as Context, "Login Failed please try again",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

class LoginViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(LoginViewmodel::class.java)) {
            LoginViewmodel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}


package org.tensorflow.codelabs.objectdetection.ui.register

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.repository.AppRepository
import org.tensorflow.codelabs.objectdetection.di.Injection
import java.lang.Exception

class RegisterViewModel(private val appRepository: AppRepository, private val application: Application): ViewModel() {

    private val _linearProgressBarVisibillity = MutableLiveData(false)
    val linearProgressBarVisibillity: LiveData<Boolean> get() = _linearProgressBarVisibillity

    private val _isRegistered = MutableLiveData(false)
    val isRegistered: LiveData<Boolean> get() = _isRegistered

    fun register(username: String,email: String,password: String) {
        _linearProgressBarVisibillity.value = true
        viewModelScope.launch {
            try {
                val response = appRepository.register(username,email,password)
                if(response.isSuccessful) {
                    _isRegistered.value = true
                    _linearProgressBarVisibillity.value = false
                }
            }catch (e: Exception) {
                _linearProgressBarVisibillity.value = false
                Toast.makeText(application as Context,"Register failed please try again",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

class RegisterViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideAuthRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            RegisterViewModel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
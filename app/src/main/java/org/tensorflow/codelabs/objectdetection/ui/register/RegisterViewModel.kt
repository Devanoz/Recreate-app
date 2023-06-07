package org.tensorflow.codelabs.objectdetection.ui.register

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.tensorflow.codelabs.objectdetection.data.AppRepository
import org.tensorflow.codelabs.objectdetection.di.Injection
import java.lang.Exception

class RegisterViewModel(private val appRepository: AppRepository): ViewModel() {

    fun register(username: String,email: String,password: String) {
        try {

        }catch (e: Exception) {

        }
    }
}

class LoginViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            RegisterViewModel(repository) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
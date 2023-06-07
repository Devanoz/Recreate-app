package org.tensorflow.codelabs.objectdetection.ui.register

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.tensorflow.codelabs.objectdetection.di.Injection

class RegisterViewModel: ViewModel() {

    fun register(username: String,email: String,password: String) {

    }
}

class LoginViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            RegisterViewModel() as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
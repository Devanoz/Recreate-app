package org.tensorflow.codelabs.objectdetection.data.repository

import android.content.Context
import org.tensorflow.codelabs.objectdetection.data.network.ApiConfig
import org.tensorflow.codelabs.objectdetection.data.network.model.LoginModel
import org.tensorflow.codelabs.objectdetection.data.network.model.RegisterModel

class AppRepository(private val context: Context) {
    private val client = ApiConfig.getApiService()

    suspend fun login(identifier: String, password: String) = client.login(LoginModel(identifier,password))

    suspend fun register(username: String,email: String, password: String) = client.registerUser(
        RegisterModel(
            username = username,
            email = email,
            password = password
        )
    )
}
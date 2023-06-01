package org.tensorflow.codelabs.objectdetection.data

import android.content.Context
import org.tensorflow.codelabs.objectdetection.api.ApiConfig
import org.tensorflow.codelabs.objectdetection.api.model.LoginModel

class AppRepository(private val context: Context) {
    private val client = ApiConfig.getApiService()

    suspend fun login(identifier: String, password: String) = client.login(LoginModel(identifier,password))
}
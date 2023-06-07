package org.tensorflow.codelabs.objectdetection.api

import org.tensorflow.codelabs.objectdetection.api.model.LoginModel
import org.tensorflow.codelabs.objectdetection.api.model.RegisterModel
import org.tensorflow.codelabs.objectdetection.api.pojo.login.LoginResponse
import org.tensorflow.codelabs.objectdetection.api.pojo.register.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/auth/local/register")
    suspend fun registerUser(@Body registerModel: RegisterModel): Response<RegisterResponse>
    @POST("api/auth/local")
    suspend fun login(@Body loginModel: LoginModel):  Response<LoginResponse>
}
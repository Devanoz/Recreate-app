package org.tensorflow.codelabs.objectdetection.data.network

import org.tensorflow.codelabs.objectdetection.data.network.model.LoginModel
import org.tensorflow.codelabs.objectdetection.data.network.model.RegisterModel
import org.tensorflow.codelabs.objectdetection.data.network.pojo.login.LoginResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.register.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @POST("api/auth/local/register")
    suspend fun registerUser(@Body registerModel: RegisterModel): Response<RegisterResponse>
    @POST("api/auth/local")
    suspend fun login(@Body loginModel: LoginModel):  Response<LoginResponse>

    @GET("api/users/me?populate=*")
    suspend fun getProfileData(): Response<ProfileResponse>
}
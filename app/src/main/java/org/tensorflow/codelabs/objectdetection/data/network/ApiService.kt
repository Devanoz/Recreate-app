package org.tensorflow.codelabs.objectdetection.data.network

import org.tensorflow.codelabs.objectdetection.data.network.model.LoginModel
import org.tensorflow.codelabs.objectdetection.data.network.model.RegisterModel
import org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.login.LoginResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.UploadProfileResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.register.RegisterResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query
import retrofit2.http.QueryMap
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.tensorflow.codelabs.objectdetection.data.network.model.ProfileModel
import org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.EditProfileResponse
import retrofit2.http.PartMap

interface ApiService {

    @POST("api/auth/local/register")
    suspend fun registerUser(@Body registerModel: RegisterModel): Response<RegisterResponse>

    @POST("api/auth/local")
    suspend fun login(@Body loginModel: LoginModel): Response<LoginResponse>

    @GET("api/users/me?populate=*")
    suspend fun getProfileData(): Response<ProfileResponse>

    @GET("api/articles")
    suspend fun getAllArticle(@Query("populate") populate: String = "*"): Response<ArticleResponse>

    @GET("api/videos")
    suspend fun getAllVideo(@Query("populate") populate: String = "*"): Response<VideoResponse>

    @GET("api/videos?populate=*")
    suspend fun getAllVideoByLabels(
        @QueryMap  queryMap: Map<String,String>,
    ): Response<VideoResponse>

    @GET("api/articles?populate=*")
    suspend fun getAllArticleByLabels(
        @QueryMap queryMap: Map<String,String>
    ): Response<ArticleResponse>

    @JvmSuppressWildcards
    @Multipart
    @POST("api/upload")
    suspend fun uploadUserPhoto(
        @Part photo: MultipartBody.Part,
        @PartMap text: Map<String,RequestBody>
    ): Response<UploadProfileResponse>

    @POST("api/user/me")
    suspend fun uploadProfileData(@Body profileModel: ProfileModel) : Response<EditProfileResponse>

}
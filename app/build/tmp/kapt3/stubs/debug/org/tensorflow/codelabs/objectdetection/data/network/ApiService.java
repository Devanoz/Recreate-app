package org.tensorflow.codelabs.objectdetection.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/network/ApiService;", "", "getAllArticle", "Lretrofit2/Response;", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/article/ArticleResponse;", "populate", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllVideo", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/video/VideoResponse;", "getProfileData", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/login/LoginResponse;", "loginModel", "Lorg/tensorflow/codelabs/objectdetection/data/network/model/LoginModel;", "(Lorg/tensorflow/codelabs/objectdetection/data/network/model/LoginModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/register/RegisterResponse;", "registerModel", "Lorg/tensorflow/codelabs/objectdetection/data/network/model/RegisterModel;", "(Lorg/tensorflow/codelabs/objectdetection/data/network/model/RegisterModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/auth/local/register")
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.tensorflow.codelabs.objectdetection.data.network.model.RegisterModel registerModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.register.RegisterResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/auth/local")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.tensorflow.codelabs.objectdetection.data.network.model.LoginModel loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.login.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/users/me?populate=*")
    public abstract java.lang.Object getProfileData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/articles")
    public abstract java.lang.Object getAllArticle(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "populate")
    java.lang.String populate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/videos")
    public abstract java.lang.Object getAllVideo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "populate")
    java.lang.String populate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}
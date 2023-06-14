package org.tensorflow.codelabs.objectdetection.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/network/ApiService;", "", "getAllArticle", "Lretrofit2/Response;", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/article/ArticleResponse;", "populate", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllArticleByLabels", "getAllVideo", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/video/VideoResponse;", "getAllVideoByLabels", "getProfileData", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/login/LoginResponse;", "loginModel", "Lorg/tensorflow/codelabs/objectdetection/data/network/model/LoginModel;", "(Lorg/tensorflow/codelabs/objectdetection/data/network/model/LoginModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/register/RegisterResponse;", "registerModel", "Lorg/tensorflow/codelabs/objectdetection/data/network/model/RegisterModel;", "(Lorg/tensorflow/codelabs/objectdetection/data/network/model/RegisterModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/videos")
    public abstract java.lang.Object getAllVideoByLabels(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "populate")
    java.lang.String populate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/article")
    public abstract java.lang.Object getAllArticleByLabels(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "populate")
    java.lang.String populate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}
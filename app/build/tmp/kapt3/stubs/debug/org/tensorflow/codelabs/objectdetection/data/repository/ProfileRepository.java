package org.tensorflow.codelabs.objectdetection.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "client", "Lorg/tensorflow/codelabs/objectdetection/data/network/ApiService;", "timeStamp", "", "token", "createCustomTempFile", "Ljava/io/File;", "application", "Landroid/app/Application;", "getProfileData", "Lretrofit2/Response;", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "uploadProfile", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/UploadProfileResponse;", "userId", "profileUri", "Landroid/net/Uri;", "(Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfileWithoutImage", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/EditProfileResponse;", "username", "email", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uriToFile", "selectedImg", "Companion", "app_debug"})
public final class ProfileRepository {
    private final android.content.Context context = null;
    private final java.lang.String token = null;
    private final org.tensorflow.codelabs.objectdetection.data.network.ApiService client = null;
    private final java.lang.String timeStamp = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository.Companion Companion = null;
    private static final java.lang.String FILENAME_FORMAT = "dd-MMM-yyyy";
    
    public ProfileRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProfileData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    android.net.Uri profileUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.UploadProfileResponse>> continuation) {
        return null;
    }
    
    private final java.io.File uriToFile(android.net.Uri selectedImg, android.app.Application application) {
        return null;
    }
    
    private final java.io.File createCustomTempFile(android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadProfileWithoutImage(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.EditProfileResponse>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository$Companion;", "", "()V", "FILENAME_FORMAT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
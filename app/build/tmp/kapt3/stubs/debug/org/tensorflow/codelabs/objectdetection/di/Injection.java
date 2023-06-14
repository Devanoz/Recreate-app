package org.tensorflow.codelabs.objectdetection.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/di/Injection;", "", "()V", "provideAuthRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/AppRepository;", "context", "Landroid/content/Context;", "provideProfileRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;", "provideRecomendationRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository;", "app_debug"})
public final class Injection {
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.di.Injection INSTANCE = null;
    
    private Injection() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.repository.AppRepository provideAuthRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository provideProfileRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository provideRecomendationRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}
package org.tensorflow.codelabs.objectdetection.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\t\u001a\u0002H\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ3\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\f\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\t\u001a\u0002H\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\r\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u000e\u001a\u0002H\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/local/PreferencesDatastoreAPI;", "", "clearAllPreference", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstPreference", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "defaultValue", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPreference", "Lkotlinx/coroutines/flow/Flow;", "putPreference", "value", "removePreference", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PreferencesDatastoreAPI {
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>java.lang.Object getPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends T>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>java.lang.Object getFirstPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>java.lang.Object putPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>java.lang.Object removePreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllPreference(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
package org.tensorflow.codelabs.objectdetection.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J3\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J-\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0006\u0010\u0014\u001a\u0002H\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J%\u0010\u0015\u001a\u00020\t\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/local/PreferencesDataStoreHelper;", "Lorg/tensorflow/codelabs/objectdetection/data/local/PreferencesDatastoreAPI;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataSource", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "clearAllPreference", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstPreference", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "defaultValue", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPreference", "Lkotlinx/coroutines/flow/Flow;", "putPreference", "value", "removePreference", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PreferencesDataStoreHelper implements org.tensorflow.codelabs.objectdetection.data.local.PreferencesDatastoreAPI {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataSource = null;
    
    public PreferencesDataStoreHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>java.lang.Object getPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends T>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>java.lang.Object getFirstPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>java.lang.Object putPreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends java.lang.Object>java.lang.Object removePreference(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearAllPreference(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
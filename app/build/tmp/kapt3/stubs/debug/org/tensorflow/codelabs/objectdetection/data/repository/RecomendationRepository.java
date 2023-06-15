package org.tensorflow.codelabs.objectdetection.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "client", "Lorg/tensorflow/codelabs/objectdetection/data/network/ApiService;", "token", "", "getAllArticleRecomendation", "Lretrofit2/Response;", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/article/ArticleResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllArticleRecomendationByLabels", "label", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllVideoRecomendation", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/video/VideoResponse;", "getAllVideoRecomendationByLabels", "Companion", "app_debug"})
public final class RecomendationRepository {
    private final android.content.Context context = null;
    private final java.lang.String token = null;
    private final org.tensorflow.codelabs.objectdetection.data.network.ApiService client = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository.Companion Companion = null;
    private static final java.lang.String LABEL_QUERY = "filters[labels][$contains]";
    
    public RecomendationRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllArticleRecomendation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllVideoRecomendation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllVideoRecomendationByLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllArticleRecomendationByLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleResponse>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository$Companion;", "", "()V", "LABEL_QUERY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package org.tensorflow.codelabs.objectdetection.ui.recomendation.article;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/article/ArticleViewModel;", "Landroidx/lifecycle/ViewModel;", "recomendationRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository;", "application", "Landroid/app/Application;", "(Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository;Landroid/app/Application;)V", "_articleList", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/article/ArticleItem;", "_isProgressbarShowing", "", "kotlin.jvm.PlatformType", "articleList", "Landroidx/lifecycle/LiveData;", "getArticleList", "()Landroidx/lifecycle/LiveData;", "isProgressBarShowing", "getAllArticleByLabels", "", "labels", "", "app_debug"})
public final class ArticleViewModel extends androidx.lifecycle.ViewModel {
    private final org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository recomendationRepository = null;
    private final android.app.Application application = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleItem>> _articleList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isProgressbarShowing = null;
    
    public ArticleViewModel(@org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository recomendationRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleItem>> getArticleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isProgressBarShowing() {
        return null;
    }
    
    public final void getAllArticleByLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> labels) {
    }
}
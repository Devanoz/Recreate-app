package org.tensorflow.codelabs.objectdetection.ui.recomendation.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/video/VideoViewModel;", "Landroidx/lifecycle/ViewModel;", "recomendationRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository;", "(Lorg/tensorflow/codelabs/objectdetection/data/repository/RecomendationRepository;)V", "_isProgressbarShowing", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_videoList", "", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/video/VideoItem;", "isProgressBarShowing", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "videoList", "getVideoList", "getAllVideo", "", "app_debug"})
public final class VideoViewModel extends androidx.lifecycle.ViewModel {
    private final org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository recomendationRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem>> _videoList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isProgressbarShowing = null;
    
    public VideoViewModel(@org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository recomendationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem>> getVideoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isProgressBarShowing() {
        return null;
    }
    
    public final void getAllVideo() {
    }
}
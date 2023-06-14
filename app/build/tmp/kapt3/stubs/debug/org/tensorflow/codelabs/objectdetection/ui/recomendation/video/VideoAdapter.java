package org.tensorflow.codelabs.objectdetection.ui.recomendation.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/video/VideoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/video/VideoAdapter$ViewHolder;", "videoList", "", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/video/VideoItem;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class VideoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.tensorflow.codelabs.objectdetection.ui.recomendation.video.VideoAdapter.ViewHolder> {
    private final java.util.List<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem> videoList = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.ui.recomendation.video.VideoAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_ID = "video_id";
    
    public VideoAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem> videoList, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.tensorflow.codelabs.objectdetection.ui.recomendation.video.VideoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.ui.recomendation.video.VideoAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/video/VideoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/VideoCardItemBinding;", "(Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/video/VideoAdapter;Lorg/tensorflow/codelabs/objectdetection/databinding/VideoCardItemBinding;)V", "bind", "", "video", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/video/VideoItem;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final org.tensorflow.codelabs.objectdetection.databinding.VideoCardItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        org.tensorflow.codelabs.objectdetection.databinding.VideoCardItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem video) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/recomendation/video/VideoAdapter$Companion;", "", "()V", "VIDEO_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
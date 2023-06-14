package org.tensorflow.codelabs.objectdetection.ui.detection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/detection/CameraPreview;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/ActivityCameraPreviewBinding;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "recording", "Landroidx/camera/video/Recording;", "videoCapture", "Landroidx/camera/video/VideoCapture;", "Landroidx/camera/video/Recorder;", "allPermissionsGranted", "", "captureVideo", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requestPermissions", "startCamera", "takePhoto", "Companion", "app_debug"})
public final class CameraPreview extends androidx.appcompat.app.AppCompatActivity {
    private org.tensorflow.codelabs.objectdetection.databinding.ActivityCameraPreviewBinding binding;
    private androidx.camera.core.ImageCapture imageCapture;
    private androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> videoCapture;
    private androidx.camera.video.Recording recording;
    private java.util.concurrent.ExecutorService cameraExecutor;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> activityResultLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.ui.detection.CameraPreview.Companion Companion = null;
    private static final java.lang.String TAG = "CameraXApp";
    private static final java.lang.String FILENAME_FORMAT = "yyyy-MM-dd-HH-mm-ss-SSS";
    private static final java.lang.String[] REQUIRED_PERMISSIONS = null;
    
    public CameraPreview() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void takePhoto() {
    }
    
    private final void captureVideo() {
    }
    
    private final void startCamera() {
    }
    
    private final void requestPermissions() {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/detection/CameraPreview$Companion;", "", "()V", "FILENAME_FORMAT", "", "REQUIRED_PERMISSIONS", "", "[Ljava/lang/String;", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package org.tensorflow.codelabs.objectdetection.ui.detection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010(\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/detection/CameraActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/ActivityCameraResultBinding;", "captureImageFab", "Landroid/widget/Button;", "currentPhotoPath", "", "imgSampleOne", "Landroid/widget/ImageView;", "imgSampleThree", "imgSampleTwo", "inputImageView", "createImageFile", "Ljava/io/File;", "debugPrint", "", "results", "", "Lorg/tensorflow/lite/task/vision/detector/Detection;", "dispatchTakePictureIntent", "drawDetectionResult", "Landroid/graphics/Bitmap;", "bitmap", "detectionResults", "Lorg/tensorflow/codelabs/objectdetection/ui/detection/DetectionResult;", "getCapturedImage", "getSampleImage", "drawable", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "rotateImage", "source", "angle", "", "runObjectDetection", "setViewAndDetect", "Companion", "app_debug"})
public final class CameraActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.codelabs.objectdetection.ui.detection.CameraActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TFLite - ODT";
    public static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final float MAX_FONT_SIZE = 96.0F;
    private android.widget.Button captureImageFab;
    private android.widget.ImageView inputImageView;
    private android.widget.ImageView imgSampleOne;
    private android.widget.ImageView imgSampleTwo;
    private android.widget.ImageView imgSampleThree;
    private java.lang.String currentPhotoPath;
    private org.tensorflow.codelabs.objectdetection.databinding.ActivityCameraResultBinding binding;
    
    public CameraActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * onClick(v: View?)
     *     Detect touches on the UI components
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    /**
     * runObjectDetection(bitmap: Bitmap)
     *     TFLite Object Detection function
     */
    private final void runObjectDetection(android.graphics.Bitmap bitmap) {
    }
    
    /**
     * debugPrint(visionObjects: List<Detection>)
     *     Print the detection result to logcat to examine
     */
    private final void debugPrint(java.util.List<? extends org.tensorflow.lite.task.vision.detector.Detection> results) {
    }
    
    /**
     * setViewAndDetect(bitmap: Bitmap)
     *     Set image to view and call object detection
     */
    private final void setViewAndDetect(android.graphics.Bitmap bitmap) {
    }
    
    /**
     * getCapturedImage():
     *     Decodes and crops the captured image from camera.
     */
    private final android.graphics.Bitmap getCapturedImage() {
        return null;
    }
    
    /**
     * getSampleImage():
     *     Get image form drawable and convert to bitmap.
     */
    private final android.graphics.Bitmap getSampleImage(int drawable) {
        return null;
    }
    
    /**
     * rotateImage():
     *    Decodes and crops the captured image from camera.
     */
    private final android.graphics.Bitmap rotateImage(android.graphics.Bitmap source, float angle) {
        return null;
    }
    
    /**
     * createImageFile():
     *    Generates a temporary image file for the Camera app to write to.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    /**
     * dispatchTakePictureIntent():
     *    Start the Camera app to take a photo.
     */
    private final void dispatchTakePictureIntent() {
    }
    
    /**
     * drawDetectionResult(bitmap: Bitmap, detectionResults: List<DetectionResult>
     *     Draw a box around each objects and show the object's name.
     */
    private final android.graphics.Bitmap drawDetectionResult(android.graphics.Bitmap bitmap, java.util.List<org.tensorflow.codelabs.objectdetection.ui.detection.DetectionResult> detectionResults) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/detection/CameraActivity$Companion;", "", "()V", "MAX_FONT_SIZE", "", "REQUEST_IMAGE_CAPTURE", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
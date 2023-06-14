package org.tensorflow.codelabs.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/ActivityMain2Binding;", "currentPhotoPath", "", "createImageFile", "Ljava/io/File;", "dispatchTakePictureIntent", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.tensorflow.codelabs.objectdetection.databinding.ActivityMain2Binding binding;
    private java.lang.String currentPhotoPath;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * dispatchTakePictureIntent():
     *    Start the Camera app to take a photo.
     */
    private final void dispatchTakePictureIntent() {
    }
    
    /**
     * createImageFile():
     *    Generates a temporary image file for the Camera app to write to.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
}
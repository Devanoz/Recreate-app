package org.tensorflow.codelabs.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/ActivityMain2Binding;", "currentPhotoPath", "", "mainViewModel", "Lorg/tensorflow/codelabs/objectdetection/MainViewModel;", "getMainViewModel", "()Lorg/tensorflow/codelabs/objectdetection/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "createImageFile", "Ljava/io/File;", "dispatchTakePictureIntent", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.tensorflow.codelabs.objectdetection.databinding.ActivityMain2Binding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private java.lang.String currentPhotoPath;
    
    public MainActivity() {
        super();
    }
    
    private final org.tensorflow.codelabs.objectdetection.MainViewModel getMainViewModel() {
        return null;
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
package org.tensorflow.codelabs.objectdetection.ui.profile.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/profile/edit/EditProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/ActivityEditProfileBinding;", "etEmail", "Lcom/google/android/material/textfield/TextInputEditText;", "etUsername", "launchIntentGallery", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "profileImage", "Lcom/google/android/material/imageview/ShapeableImageView;", "profileUri", "Landroid/net/Uri;", "updateProfileButton", "Lcom/google/android/material/button/MaterialButton;", "viewModel", "Lorg/tensorflow/codelabs/objectdetection/ui/profile/edit/EditProfileViewModel;", "getViewModel", "()Lorg/tensorflow/codelabs/objectdetection/ui/profile/edit/EditProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "isFormValid", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class EditProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.tensorflow.codelabs.objectdetection.databinding.ActivityEditProfileBinding binding;
    private com.google.android.material.button.MaterialButton updateProfileButton;
    private com.google.android.material.textfield.TextInputEditText etUsername;
    private com.google.android.material.textfield.TextInputEditText etEmail;
    private com.google.android.material.imageview.ShapeableImageView profileImage;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> launchIntentGallery = null;
    private android.net.Uri profileUri;
    
    public EditProfileActivity() {
        super();
    }
    
    private final org.tensorflow.codelabs.objectdetection.ui.profile.edit.EditProfileViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean isFormValid() {
        return false;
    }
}
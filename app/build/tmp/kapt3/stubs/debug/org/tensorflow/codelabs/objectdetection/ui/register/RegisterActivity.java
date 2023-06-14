package org.tensorflow.codelabs.objectdetection.ui.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/register/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/tensorflow/codelabs/objectdetection/databinding/ActivityRegisterBinding;", "emailInput", "Lcom/google/android/material/textfield/TextInputEditText;", "passwordInput", "repeatPasswordInput", "usernameInput", "viewModel", "Lorg/tensorflow/codelabs/objectdetection/ui/register/RegisterViewModel;", "getViewModel", "()Lorg/tensorflow/codelabs/objectdetection/ui/register/RegisterViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkRegisterValidationAndSubmit", "", "isValidEmail", "", "target", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setRegisterValidation", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.tensorflow.codelabs.objectdetection.databinding.ActivityRegisterBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.google.android.material.textfield.TextInputEditText usernameInput;
    private com.google.android.material.textfield.TextInputEditText emailInput;
    private com.google.android.material.textfield.TextInputEditText passwordInput;
    private com.google.android.material.textfield.TextInputEditText repeatPasswordInput;
    
    public RegisterActivity() {
        super();
    }
    
    private final org.tensorflow.codelabs.objectdetection.ui.register.RegisterViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setRegisterValidation() {
    }
    
    private final void checkRegisterValidationAndSubmit() {
    }
    
    private final boolean isValidEmail(java.lang.CharSequence target) {
        return false;
    }
}
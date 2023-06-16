package org.tensorflow.codelabs.objectdetection.ui.profile.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/profile/edit/EditProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;", "application", "Landroid/app/Application;", "(Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;Landroid/app/Application;)V", "userId", "", "uploadProfileData", "", "username", "email", "uploadProfilePhoto", "profileUri", "Landroid/net/Uri;", "app_debug"})
public final class EditProfileViewModel extends androidx.lifecycle.ViewModel {
    private final org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository profileRepository = null;
    private final android.app.Application application = null;
    private final java.lang.String userId = null;
    
    public EditProfileViewModel(@org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository profileRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    public final void uploadProfilePhoto(@org.jetbrains.annotations.NotNull()
    android.net.Uri profileUri) {
    }
    
    public final void uploadProfileData(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
}
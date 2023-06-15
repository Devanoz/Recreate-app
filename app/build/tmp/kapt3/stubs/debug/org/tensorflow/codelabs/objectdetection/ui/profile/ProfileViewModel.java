package org.tensorflow.codelabs.objectdetection.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;", "application", "Landroid/app/Application;", "(Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;Landroid/app/Application;)V", "_profileData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "profileData", "Landroidx/lifecycle/LiveData;", "getProfileData", "()Landroidx/lifecycle/LiveData;", "logout", "", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository profileRepository = null;
    private final android.app.Application application = null;
    private final androidx.lifecycle.MutableLiveData<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse> _profileData = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository profileRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse> getProfileData() {
        return null;
    }
    
    public final void logout() {
    }
}
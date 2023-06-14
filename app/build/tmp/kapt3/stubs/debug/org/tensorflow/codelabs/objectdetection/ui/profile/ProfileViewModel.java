package org.tensorflow.codelabs.objectdetection.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileRepository", "Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;", "(Lorg/tensorflow/codelabs/objectdetection/data/repository/ProfileRepository;)V", "_profileData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "profileData", "Landroidx/lifecycle/LiveData;", "getProfileData", "()Landroidx/lifecycle/LiveData;", "", "logout", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository profileRepository = null;
    private final androidx.lifecycle.MutableLiveData<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse> _profileData = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository profileRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse> getProfileData() {
        return null;
    }
    
    public final void getProfileData() {
    }
    
    public final void logout() {
    }
}
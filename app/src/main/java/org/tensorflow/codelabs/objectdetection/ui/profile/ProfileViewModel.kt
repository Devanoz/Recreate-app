package org.tensorflow.codelabs.objectdetection.ui.profile

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse
import org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository
import org.tensorflow.codelabs.objectdetection.di.Injection
import java.lang.Exception

class ProfileViewModel(private val profileRepository: ProfileRepository,private val application: Application): ViewModel() {

    private val _profileData = MutableLiveData<ProfileResponse>()
    val profileData: LiveData<ProfileResponse> get() = _profileData


    fun logout() {
        viewModelScope.launch {
            profileRepository.logout()
        }
    }
}

class ProfileViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideProfileRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            ProfileViewModel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
package org.tensorflow.codelabs.objectdetection.ui.profile.edit

import android.app.Application
import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository
import org.tensorflow.codelabs.objectdetection.di.Injection
import org.tensorflow.codelabs.objectdetection.ui.profile.ProfileViewModel
import java.lang.Exception

class EditProfileViewModel(private val profileRepository: ProfileRepository,private val application: Application): ViewModel() {

    private val userId = runBlocking {
        PreferencesDataStoreHelper(application).getFirstPreference(PreferencesDataStoreConstans.USER_ID,"")
    }

    fun uploadProfilePhoto(profileUri: Uri) {
        viewModelScope.launch {
            try {
                val response = profileRepository.uploadProfile(userId,profileUri)
                if(response.isSuccessful) {
                    Log.d("uploadProfileResponse", response.body().toString())
                }
            }catch (e: Exception) {
                Log.d("error123123",e.message.toString())
            }
        }
    }
}

class EditProfileViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideProfileRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(EditProfileViewModel::class.java)) {
            EditProfileViewModel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
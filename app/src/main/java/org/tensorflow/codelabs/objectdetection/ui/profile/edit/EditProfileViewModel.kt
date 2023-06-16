package org.tensorflow.codelabs.objectdetection.ui.profile.edit

import android.app.Activity
import android.app.Application
import android.content.Context
import android.net.Uri
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository
import org.tensorflow.codelabs.objectdetection.di.Injection

class EditProfileViewModel(
    private val profileRepository: ProfileRepository,
    private val application: Application
) : ViewModel() {

    private val userId = runBlocking {
        PreferencesDataStoreHelper(application).getFirstPreference(
            PreferencesDataStoreConstans.USER_ID,
            ""
        )
    }

    fun uploadProfilePhoto(profileUri: Uri) {
        val jobA = viewModelScope.launch {
            try {
                val response = profileRepository.uploadProfile(userId, profileUri)
                if (response.isSuccessful) {
                    Log.d("uploadProfileResponse", response.body().toString())

                }
            } catch (e: Exception) {
                Log.d("error123123", e.message.toString())
            }
        }.invokeOnCompletion {
            viewModelScope.launch {
                try {
                    val profileResponse = profileRepository.getProfileData()
                    if(profileResponse.isSuccessful) {
                        val profileData = profileResponse.body()
                        if(profileData != null) {
                            val preferencesDataStoreHelper = PreferencesDataStoreHelper(application)
                            preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.PROFILE_URL,profileData.avatar?.url!!)
                            preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.USERNAME,profileData.username!!)
                            preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.EMAIL,profileData.email!!)
                        }
                        Log.d("alsdkfjalsdfkj","ok")
                        Toast.makeText(application as Context, "Upload Profile Success",Toast.LENGTH_SHORT).show()
                    }
                }catch (e: Exception) {
                    Log.d("error",e.message.toString())
                }
            }
        }
    }

    fun uploadProfileData(username: String, email: String) {
        viewModelScope.launch {
            try {
                val response = profileRepository.uploadProfileWithoutImage(username, email)
                if(response.isSuccessful) {

                }
            } catch (e: Exception) {
                Log.d("error",e.message.toString())
            }
        }.invokeOnCompletion {
            viewModelScope.launch {
                try {
                    val profileResponse = profileRepository.getProfileData()
                    if(profileResponse.isSuccessful) {
                        val profileData = profileResponse.body()
                        if(profileData != null) {
                            val preferencesDataStoreHelper = PreferencesDataStoreHelper(application)
                            preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.USERNAME,profileData.username!!)
                            preferencesDataStoreHelper.putPreference(PreferencesDataStoreConstans.EMAIL,profileData.email!!)
                        }
                    }
                }catch (e: Exception) {
                    Log.d("error",e.message.toString())
                }
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
            EditProfileViewModel(repository, application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
package org.tensorflow.codelabs.objectdetection

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository
import org.tensorflow.codelabs.objectdetection.di.Injection
import java.lang.Exception

class MainViewModel(private val profileRepository: ProfileRepository, private val application: Application): ViewModel() {

    fun getProfileData() {
        viewModelScope.launch {
            val response = profileRepository.getProfileData()
            try {
                if(response.isSuccessful) {
                    Log.d("getProfileData",response.body().toString())
                    val avatarUrl = response.body()?.avatar?.url
                    PreferencesDataStoreHelper(application).putPreference(
                        PreferencesDataStoreConstans.PROFILE_URL,avatarUrl.toString())
                }else {

                }
            }catch (e: Exception) {
                Log.d("error","error")
            }
        }
    }
}

class MainViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideProfileRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
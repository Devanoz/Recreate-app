package org.tensorflow.codelabs.objectdetection.di

import android.content.Context

import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.api.ApiConfig
import org.tensorflow.codelabs.objectdetection.data.repository.AppRepository
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository

object Injection {
    fun provideAuthRepository(context: Context): AppRepository {
        return AppRepository(context = context)
    }
    fun provideProfileRepository(context: Context): ProfileRepository {
        return ProfileRepository(context)
    }
}
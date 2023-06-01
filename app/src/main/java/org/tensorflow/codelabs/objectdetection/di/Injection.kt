package org.tensorflow.codelabs.objectdetection.di

import android.content.Context

import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.api.ApiConfig
import org.tensorflow.codelabs.objectdetection.data.AppRepository
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper

object Injection {
    fun provideRepository(context: Context): AppRepository {
        val token = runBlocking {
            PreferencesDataStoreHelper(context).getFirstPreference(
                PreferencesDataStoreConstans.TOKEN,
                ""
            )
        }
        val apiService = ApiConfig.getApiServiceWithToken(token)
        return AppRepository(context = context)
    }
}
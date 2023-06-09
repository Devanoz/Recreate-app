package org.tensorflow.codelabs.objectdetection.data.repository

import android.content.Context
import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.api.ApiConfig
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper

class ProfileRepository(private val context: Context) {
    private val token = runBlocking {
        PreferencesDataStoreHelper(context).getFirstPreference(PreferencesDataStoreConstans.TOKEN,"")
    }
    private val client = ApiConfig.getApiServiceWithToken(token)

    suspend fun getProfileData() = client.getProfileData()
}
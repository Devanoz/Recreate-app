package org.tensorflow.codelabs.objectdetection.data.repository

import android.content.Context
import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.network.ApiConfig

class RecomendationRepository(private val context: Context) {
    private val token = runBlocking {
        PreferencesDataStoreHelper(context).getFirstPreference(PreferencesDataStoreConstans.TOKEN,"")
    }
    private val client = ApiConfig.getApiServiceWithToken(token)

    suspend fun getAllArticleRecomendation() = client.getAllArticle()
}
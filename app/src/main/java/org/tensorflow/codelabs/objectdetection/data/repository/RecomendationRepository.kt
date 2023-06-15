package org.tensorflow.codelabs.objectdetection.data.repository

import android.content.Context
import androidx.room.util.query
import kotlinx.coroutines.runBlocking
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.data.network.ApiConfig
import org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleResponse
import org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoResponse
import retrofit2.Response

class RecomendationRepository(private val context: Context) {
    private val token = runBlocking {
        PreferencesDataStoreHelper(context).getFirstPreference(PreferencesDataStoreConstans.TOKEN,"")
    }
    private val client = ApiConfig.getApiServiceWithToken(token)

    suspend fun getAllArticleRecomendation() = client.getAllArticle()

    suspend fun getAllVideoRecomendation() = client.getAllVideo()

    suspend fun getAllVideoRecomendationByLabels(label: List<String>): Response<VideoResponse> {
        val labelPairs = label.map {
            Pair(LABEL_QUERY,it)
        }
        val queryMap = labelPairs.toMap()
        return client.getAllVideoByLabels(queryMap)
    }

    suspend fun getAllArticleRecomendationByLabels(label: List<String>): Response<ArticleResponse> {
        val labelPairs = label.map {
            Pair(LABEL_QUERY,it)
        }
        val queryMap = labelPairs.toMap()
        return client.getAllArticleByLabels(queryMap)
    }

    companion object {
        private const val LABEL_QUERY = "filters[labels][\$contains]"
    }
}
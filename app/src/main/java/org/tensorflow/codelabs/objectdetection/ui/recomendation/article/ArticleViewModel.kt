package org.tensorflow.codelabs.objectdetection.ui.recomendation.article

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleItem
import org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository
import org.tensorflow.codelabs.objectdetection.di.Injection

class ArticleViewModel(private val recomendationRepository: RecomendationRepository, private val application: Application): ViewModel() {
    private val _articleList = MutableLiveData<List<ArticleItem>>()
    val articleList: LiveData<List<ArticleItem>> get() = _articleList

    private val _isProgressbarShowing = MutableLiveData(false)
    val isProgressBarShowing: LiveData<Boolean> get() = _isProgressbarShowing

//    fun getAllArticle() {
//        _isProgressbarShowing.value = true
//        viewModelScope.launch {
//            try {
//                val response  = recomendationRepository.getAllArticleRecomendation()
//                if(response.isSuccessful) {
//                    val articleListValue = response.body()?.data
//                    if(articleListValue != null) {
//                        _articleList.value = articleListValue!!
//                    }
//                    _isProgressbarShowing.value = false
//                    Log.d("dataArticle",articleList.toString())
//                }else {
//                    Log.d("dataArticle","response is not success")
//                    _isProgressbarShowing.value = false
//                }
//            }catch (e: Exception) {
//                Log.d("error","error")
//                _isProgressbarShowing.value = false
//            }
//        }
//    }

    fun getAllArticleByLabels(labels: List<String> = listOf("")) {
        _isProgressbarShowing.value = true
        viewModelScope.launch {
            try {
                val response = recomendationRepository.getAllArticleRecomendationByLabels(labels)
                if(response.isSuccessful) {
                    val articleListValue = response.body()?.data
                    if(articleListValue != null) {
                        _articleList.value = articleListValue!!
                    }
                    _isProgressbarShowing.value = false
                }else {
                    _isProgressbarShowing.value = false
                }
            }catch (e: Exception) {
                Log.d("error","error")
            }
        }
    }
}


class ArticleViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideRecomendationRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ArticleViewModel::class.java)) {
            ArticleViewModel(repository,application) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
package org.tensorflow.codelabs.objectdetection.ui.recomendation.video

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem
import org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository
import org.tensorflow.codelabs.objectdetection.di.Injection

class VideoViewModel(private val recomendationRepository: RecomendationRepository): ViewModel() {
    private val _videoList = MutableLiveData<List<VideoItem>>()
    val videoList: LiveData<List<VideoItem>> get() = _videoList

    private val _isProgressbarShowing = MutableLiveData(false)
    val isProgressBarShowing: LiveData<Boolean> get() = _isProgressbarShowing

//    fun getAllVideo() {
//        _isProgressbarShowing.value = true
//        viewModelScope.launch {
//            try {
//                val response  = recomendationRepository.getAllVideoRecomendation()
//                if(response.isSuccessful) {
//                    val videoListValue = response.body()?.data
//                    if(videoListValue!=null) {
//                        _videoList.value = videoListValue!!
//                    }
//                    _isProgressbarShowing.value = false
//                }else {
//                    Log.d("videoList","response is not success")
//                    _isProgressbarShowing.value = false
//                }
//            }catch (e: Exception) {
//                Log.d("error","error")
//                _isProgressbarShowing.value = false
//            }
//        }
//    }

    fun getAllVideoByLabels(labels: List<String>) {
        _isProgressbarShowing.value = true
        viewModelScope.launch {
            try {
                val response = recomendationRepository.getAllVideoRecomendationByLabels(labels)
                if(response.isSuccessful) {
                    val videoListValue = response.body()?.data
                    if(videoListValue != null) {
                        _videoList.value = videoListValue!!
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

class VideoViewModelFactory constructor(private val application: Application) :
    ViewModelProvider.Factory {

    private val repository = Injection.provideRecomendationRepository(application as Context)

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(VideoViewModel::class.java)) {
            VideoViewModel(repository) as T
        } else {
            throw IllegalArgumentException("Viewmodel not found")
        }
    }
}
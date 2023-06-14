package org.tensorflow.codelabs.objectdetection.ui.recomendation.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import org.tensorflow.codelabs.objectdetection.databinding.ActivityVideoListBinding

class VideoListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoListBinding

    private val viewModel by viewModels<VideoViewModel> { VideoViewModelFactory(application)  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getAllVideo()

        val recyclerViewVideo = binding.rvVideo

        recyclerViewVideo.layoutManager = LinearLayoutManager(this)

        viewModel.videoList.observe(this) {
            recyclerViewVideo.adapter = VideoAdapter(it,this@VideoListActivity)
        }

        viewModel.isProgressBarShowing.observe(this) {isShowing ->
            binding.progressBar.visibility = if(isShowing) View.VISIBLE else View.INVISIBLE
        }
    }
}
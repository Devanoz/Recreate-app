package org.tensorflow.codelabs.objectdetection.ui.recomendation.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import org.tensorflow.codelabs.objectdetection.databinding.ActivityVideoDetailBinding
import org.tensorflow.codelabs.objectdetection.ui.recomendation.video.VideoAdapter

class VideoDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val youtubePlayerView = binding.youtubePlayerView

        lifecycle.addObserver(youtubePlayerView)

        youtubePlayerView.addYouTubePlayerListener(object: AbstractYouTubePlayerListener() {

            override fun onReady(youTubePlayer: YouTubePlayer) {
                intent.getStringExtra(VideoAdapter.VIDEO_ID)?.let { videoId ->
                    youTubePlayer.loadVideo(videoId, 0F);
                }

            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.youtubePlayerView.release()
    }
}
package org.tensorflow.codelabs.objectdetection.ui.recomendation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.ActivityVideoListBinding

class VideoListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
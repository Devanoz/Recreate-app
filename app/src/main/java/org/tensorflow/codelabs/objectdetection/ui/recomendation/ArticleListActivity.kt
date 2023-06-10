package org.tensorflow.codelabs.objectdetection.ui.recomendation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.ActivityArticleListBinding

class ArticleListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArticleListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
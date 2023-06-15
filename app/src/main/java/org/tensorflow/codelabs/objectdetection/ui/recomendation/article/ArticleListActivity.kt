package org.tensorflow.codelabs.objectdetection.ui.recomendation.article

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.ActivityArticleListBinding
import org.tensorflow.codelabs.objectdetection.ui.detection.CameraActivity

class ArticleListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArticleListBinding

    private val viewModel by viewModels<ArticleViewModel> { ArticleViewModelFactory(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewArticle = binding.rvArticle

        recyclerViewArticle.layoutManager = LinearLayoutManager(this)

        viewModel.articleList.observe(this) {
            recyclerViewArticle.adapter = ArticleAdapter(it,this@ArticleListActivity)
        }

        viewModel.isProgressBarShowing.observe(this) {isShowing ->
            binding.progressBar.visibility = if(isShowing) View.VISIBLE else View.INVISIBLE
        }

        intent.getStringArrayListExtra(CameraActivity.LABELS)?.let { listofLabels ->
            viewModel.getAllArticleByLabels(listofLabels)
        }
    }
}
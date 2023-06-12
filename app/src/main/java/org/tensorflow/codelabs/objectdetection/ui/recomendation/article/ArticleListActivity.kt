package org.tensorflow.codelabs.objectdetection.ui.recomendation.article

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.ActivityArticleListBinding

class ArticleListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArticleListBinding

    private val viewModel by viewModels<ArticleViewModel> { ArticleViewModelFactory(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getAllArticle()

        val recyclerViewArticle = binding.rvArticle


        recyclerViewArticle.layoutManager = LinearLayoutManager(this)

        viewModel.articleList.observe(this) {
            recyclerViewArticle.adapter = ArticleAdapter(it,this@ArticleListActivity)
        }
    }
}
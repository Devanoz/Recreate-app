package org.tensorflow.codelabs.objectdetection.ui.recomendation.detail

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.codelabs.objectdetection.databinding.ActivityArticleDetailBinding
import org.tensorflow.codelabs.objectdetection.ui.recomendation.article.ArticleAdapter

class ArticleDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArticleDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webview = binding.webView
        val webViewSettings = webview.settings
        val linkDetail = intent.getStringExtra(ArticleAdapter.ARTICLE_URL)

        webview.webViewClient = WebViewClient()

        webViewSettings.javaScriptEnabled = true

        linkDetail?.let {
            webview.loadUrl(it)
        }

    }
}
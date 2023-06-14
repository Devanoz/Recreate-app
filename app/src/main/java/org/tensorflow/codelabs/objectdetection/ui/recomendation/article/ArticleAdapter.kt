package org.tensorflow.codelabs.objectdetection.ui.recomendation.article

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.tensorflow.codelabs.objectdetection.data.network.pojo.article.ArticleItem
import org.tensorflow.codelabs.objectdetection.databinding.ArticleCardItemBinding
import org.tensorflow.codelabs.objectdetection.ui.recomendation.detail.ArticleDetailActivity
import org.tensorflow.codelabs.objectdetection.util.DateUtils

class ArticleAdapter(private val articleList: List<ArticleItem>, private val context: Context) :
    RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ArticleCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: ArticleItem) {
            binding.apply {
                tvTitle.text = article.attributes.title
                tvDateCreated.text = DateUtils.formatDate(article.attributes.createdAt)
                val thumbnailUrl = article.attributes.image.data.attributes.url
                Glide.with(context).load(thumbnailUrl).into(binding.imvThumbnail)
                root.setOnClickListener {
                    val intent = Intent(context, ArticleDetailActivity::class.java)
                    intent.putExtra(ARTICLE_URL,article.attributes.link)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleAdapter.ViewHolder {
        val binding = ArticleCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleAdapter.ViewHolder, position: Int) {
        val articleItem = articleList[position]
        holder.bind(articleItem)
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    companion object {
        const val ARTICLE_URL = "article_url"
    }

}
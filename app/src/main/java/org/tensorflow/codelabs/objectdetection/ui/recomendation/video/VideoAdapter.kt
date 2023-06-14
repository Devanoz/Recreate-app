package org.tensorflow.codelabs.objectdetection.ui.recomendation.video

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.tensorflow.codelabs.objectdetection.data.network.pojo.video.VideoItem
import org.tensorflow.codelabs.objectdetection.data.repository.RecomendationRepository
import org.tensorflow.codelabs.objectdetection.databinding.VideoCardItemBinding
import org.tensorflow.codelabs.objectdetection.ui.recomendation.detail.VideoDetailActivity
import org.tensorflow.codelabs.objectdetection.util.DateUtils

class VideoAdapter(private val videoList: List<VideoItem>,private val context: Context)
    : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: VideoCardItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
        fun bind(video: VideoItem) {
            binding.apply {
                tvTitle.text = video.attributes.title
                tvDateCreated.text = DateUtils.formatDate(video.attributes.createdAt)
                val thumbnailUrl = video.attributes.image.data.attributes.url
                Glide.with(context).load(thumbnailUrl).into(binding.imvThumbnail)
                root.setOnClickListener {
                    val intent = Intent(context, VideoDetailActivity::class.java)
                    intent.putExtra(VIDEO_ID,video.attributes.videoId)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoAdapter.ViewHolder {
        val binding = VideoCardItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoAdapter.ViewHolder, position: Int) {
        val videoItem = videoList[position]
        holder.bind(videoItem)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    companion object {
        const val VIDEO_ID = "video_id"
    }
}


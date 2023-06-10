package org.tensorflow.codelabs.objectdetection.ui.detection

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.tensorflow.codelabs.objectdetection.databinding.LabelItemBinding

class LabelAdapter(private val labelList: List<String>):
    RecyclerView.Adapter<LabelAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: LabelItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(labelText: String) {
            binding.labelTextView.text = labelText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LabelAdapter.ViewHolder {
        val binding = LabelItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LabelAdapter.ViewHolder, position: Int) {
        val label = labelList[position]
        holder.bind(label)
    }

    override fun getItemCount(): Int {
        return labelList.size
    }

}
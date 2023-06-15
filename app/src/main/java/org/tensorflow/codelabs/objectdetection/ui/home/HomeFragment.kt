package org.tensorflow.codelabs.objectdetection.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.databinding.FragmentHomeBinding
import org.tensorflow.codelabs.objectdetection.ui.recomendation.article.ArticleListActivity
import org.tensorflow.codelabs.objectdetection.ui.recomendation.video.VideoListActivity


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.articleCardView.setOnClickListener {
            val intent =
                Intent(requireActivity().applicationContext, ArticleListActivity::class.java)
            startActivity(intent)
        }
        binding.videoCardView.setOnClickListener {
            val intent = Intent(requireActivity().applicationContext, VideoListActivity::class.java)
            startActivity(intent)
        }

        val tvUsername = binding.tvUsername
        val imvProfile = binding.profileImage

        val preferencesDataStoreHelper =
            PreferencesDataStoreHelper(requireActivity().applicationContext)

        lifecycleScope.launch {
            preferencesDataStoreHelper.apply {
                getPreference(PreferencesDataStoreConstans.USERNAME, "").collect { username ->
                    tvUsername.text = username
                }
            }
        }
        lifecycleScope.launch {
            lifecycleScope.launch {
                preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.PROFILE_URL,"").collect {
                    if(it.isNotEmpty()) {
                        Glide.with(this@HomeFragment).load(it).into(imvProfile)
                    }else {
                        imvProfile.setImageDrawable(view.let { it1 ->
                            ContextCompat.getDrawable(
                                it1.context, R.drawable.default_profile)
                        })
                    }
                }
            }
        }
    }
}
package org.tensorflow.codelabs.objectdetection.ui.profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.databinding.FragmentProfileBinding
import org.tensorflow.codelabs.objectdetection.ui.profile.edit.EditProfileActivity
import org.tensorflow.codelabs.objectdetection.util.DateUtils
import java.util.Date

class ProfileFragment : Fragment() {

    private val viewModel by viewModels<ProfileViewModel> { ProfileViewModelFactory(requireActivity().application) }

    private lateinit var binding: FragmentProfileBinding

    private lateinit var usernameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var joinedAtTextView: TextView

    private lateinit var usernameTextViewSection: TextView
    private lateinit var emailTextViewSection: TextView
    private lateinit var joinedAtTextViewSection: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usernameTextView = binding.usernameTextview
        emailTextView = binding.emailTextview
        joinedAtTextView = binding.createdAtTextview

        usernameTextViewSection = binding.tvUsername
        emailTextViewSection = binding.tvEmail
        joinedAtTextViewSection = binding.tvCreatedAt

//        viewModel.profileData.observe(viewLifecycleOwner) {
//            Log.d("myLog",it.createdAt)
//            usernameTextView.text = it.username
//            emailTextView.text = it.email
//            joinedAtTextView.text  = DateUtils.formatDate(it.createdAt)
//
//            usernameTextViewSection.text = it.username
//            emailTextViewSection.text = it.email
//            joinedAtTextViewSection.text = DateUtils.formatDate(it.createdAt)
//
//            if(it.avatar!=null) {
//                Glide.with(this).load(it.avatar).into(binding.profileImageView)
//            }else {
//                binding.profileImageView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.default_profile))
//            }
//        }



        binding.editIcon.setOnClickListener {
            startActivity(Intent(requireActivity().applicationContext,EditProfileActivity::class.java))
        }

        binding.logoutButton.setOnClickListener {
            viewModel.logout()
            activity?.finish()
        }
        setProfileData()
    }



    private fun setProfileData() {
        val preferencesDataStoreHelper = PreferencesDataStoreHelper(requireActivity().applicationContext)

        lifecycleScope.launch {

            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.EMAIL,"").collect {email ->
                emailTextView.text = email
                emailTextViewSection.text = email
            }

        }
        lifecycleScope.launch {
            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.USERNAME,"").collect {username ->
                usernameTextView.text = username
                usernameTextViewSection.text = username
            }
        }
        lifecycleScope.launch {
            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.JOINED_AT,"").collect {
                joinedAtTextView.text = DateUtils.formatDate(it)
                joinedAtTextViewSection.text = DateUtils.formatDate(it)
            }
        }
        lifecycleScope.launch {
            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.PROFILE_URL,"").collect {
                if(it.isNotEmpty()) {
                    Glide.with(this@ProfileFragment).load(it).into(binding.profileImageView)
                }else {
                    binding.profileImageView.setImageDrawable(view?.let { it1 ->
                        ContextCompat.getDrawable(
                            it1.context, R.drawable.default_profile)
                    })
                }
            }
        }
    }

}
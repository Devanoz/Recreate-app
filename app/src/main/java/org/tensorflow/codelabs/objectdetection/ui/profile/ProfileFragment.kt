package org.tensorflow.codelabs.objectdetection.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.FragmentProfileBinding
import org.tensorflow.codelabs.objectdetection.ui.profile.edit.EditProfileActivity
import org.w3c.dom.Text

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

        viewModel.profileData.observe(viewLifecycleOwner) {
            usernameTextView.text = it.username
            emailTextView.text = it.email
            joinedAtTextView.text  = it.createdAt

            usernameTextViewSection.text = it.username
            emailTextViewSection.text = it.email
            joinedAtTextViewSection.text = it.createdAt

            if(it.avatar!=null) {
                Glide.with(this).load(it.avatar).into(binding.profileImageView)
            }else {
                binding.profileImageView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.default_profile))
            }
        }

        binding.editIcon.setOnClickListener {
            startActivity(Intent(requireActivity().applicationContext,EditProfileActivity::class.java))
        }

        binding.logoutButton.setOnClickListener {
            viewModel.logout()
            activity?.finish()
        }

    }

}
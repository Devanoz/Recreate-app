package org.tensorflow.codelabs.objectdetection.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private val viewModel by viewModels<ProfileViewModel> { ProfileViewModelFactory(requireActivity().application) }

    private lateinit var binding: FragmentProfileBinding

    private lateinit var usernameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var joinedAtTextView: TextView

    private lateinit var usernameTextField: TextInputEditText
    private lateinit var emailTextField: TextInputEditText
    private lateinit var joinedAtTextField: TextInputEditText

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
        usernameTextField = binding.usernameTextField
        emailTextField = binding.emailTextfield
        joinedAtTextField = binding.joinedAtTextField

        usernameTextView = binding.usernameTextview
        emailTextView = binding.emailTextview
        joinedAtTextView = binding.createdAtTextview

        usernameTextField.isEnabled = false
        emailTextField.isEnabled = false
        joinedAtTextField.isEnabled = false

        viewModel.profileData.observe(viewLifecycleOwner) {
            usernameTextField.setText(it.username)
            usernameTextView.text = it.username
            emailTextField.setText(it.email)
            emailTextView.text = it.email
            joinedAtTextField.setText(it.createdAt)
            joinedAtTextView.text  = it.createdAt

            if(it.avatar!=null) {
                Glide.with(this).load(it.avatar).into(binding.profileImageView)
            }else {
                binding.profileImageView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.default_profile))
            }
        }

        binding.logoutButton.setOnClickListener {
            viewModel.logout()
            activity?.finish()
        }

    }

}
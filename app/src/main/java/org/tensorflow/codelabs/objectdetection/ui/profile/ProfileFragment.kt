package org.tensorflow.codelabs.objectdetection.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.textfield.TextInputEditText
import org.tensorflow.codelabs.objectdetection.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private val viewModel by viewModels<ProfileViewModel> { ProfileViewModelFactory(requireActivity().application) }

    private lateinit var binding: FragmentProfileBinding

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

        viewModel.profileData.observe(viewLifecycleOwner) {
            usernameTextField.setText(it.username)
            emailTextField.setText(it.email)
            joinedAtTextField.setText(it.createdAt)
        }
    }

}
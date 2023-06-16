package org.tensorflow.codelabs.objectdetection.ui.profile.edit

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.launch
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreConstans
import org.tensorflow.codelabs.objectdetection.data.local.PreferencesDataStoreHelper
import org.tensorflow.codelabs.objectdetection.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding

    private lateinit var updateProfileButton: MaterialButton
    private lateinit var etUsername: TextInputEditText
    private lateinit var etEmail: TextInputEditText

    private lateinit var profileImage: ShapeableImageView

    private val viewModel by viewModels<EditProfileViewModel> { EditProfileViewModelFactory(application) }

    private val launchIntentGallery = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if(uri != null && isFormValid()) {
            profileUri = uri
            Glide.with(this)
                .load(uri)
                .into(profileImage)
        }
    }

    private var profileUri: Uri? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateProfileButton = binding.btUpdateProfile
        etUsername = binding.etUsername
        etEmail = binding.etEmail

        profileImage = binding.profileImage


        val preferencesDataStoreHelper = PreferencesDataStoreHelper(application)

        lifecycleScope.launch {
            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.USERNAME,"").collect {
                etUsername.setText(it)
            }
        }

        lifecycleScope.launch {
            preferencesDataStoreHelper.getPreference(PreferencesDataStoreConstans.EMAIL,"").collect {
                etEmail.setText(it)
            }
        }

        binding.btChangeProfilePhoto.setOnClickListener {
            launchIntentGallery.launch("image/*")
        }
        binding.btUpdateProfile.setOnClickListener {
            if(profileUri != null) {
                Log.d("profileUri",profileUri.toString())
                viewModel.uploadProfilePhoto(profileUri!!)
            }
            if(isFormValid()) {
                viewModel.uploadProfileData(etUsername.text.toString(),etEmail.text.toString())
            }
        }

    }

    private fun isFormValid(): Boolean {
        return etEmail.text.toString().isNotEmpty() && etUsername.text.toString().isNotEmpty()
    }
}
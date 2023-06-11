package org.tensorflow.codelabs.objectdetection.ui.profile.edit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
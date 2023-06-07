package org.tensorflow.codelabs.objectdetection.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.tensorflow.codelabs.objectdetection.R
import org.tensorflow.codelabs.objectdetection.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernameInput = binding.usernameTextfield
        val emailInput = binding.emailTextfield
        val passwordInput = binding.passwordTextfield
        val repeatPasswordInput = binding.repeatPasswordTextfield


    }


}
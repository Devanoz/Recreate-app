package org.tensorflow.codelabs.objectdetection.ui.login

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.activity.viewModels
import androidx.core.widget.doOnTextChanged
import org.tensorflow.codelabs.objectdetection.MainActivity
import org.tensorflow.codelabs.objectdetection.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private val viewModel by viewModels<LoginViewmodel> { LoginViewModelFactory(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val indentifierTextfield = binding.identifierTextfield
        val passwordTextfield = binding.passwordTextfield
        val loginButton = binding.loginButton
        val topProgressIndicator = binding.linearProgressBar

        viewModel.linearProgressVisibility.observe(this) {isShowing ->
            topProgressIndicator.visibility = if(isShowing) View.VISIBLE else View.INVISIBLE
        }
        viewModel.isLoggedin.observe(this) {
            if(it) {
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }

        loginButton.setOnClickListener {
            val identifier = indentifierTextfield.text.toString().trim()
            val password  = passwordTextfield.text.toString().trim()
            viewModel.login(identifier,password)
        }

    }
}
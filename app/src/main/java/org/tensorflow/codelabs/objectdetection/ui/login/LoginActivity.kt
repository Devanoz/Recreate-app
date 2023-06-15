package org.tensorflow.codelabs.objectdetection.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.codelabs.objectdetection.MainActivity
import org.tensorflow.codelabs.objectdetection.databinding.ActivityLoginBinding
import org.tensorflow.codelabs.objectdetection.ui.register.RegisterActivity

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
        val signUpTextView = binding.signUpTextView

        viewModel.linearProgressVisibility.observe(this) { isShowing ->
            topProgressIndicator.visibility = if (isShowing) View.VISIBLE else View.INVISIBLE
        }
        viewModel.isLoggedin.observe(this) {
            if (it) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }

        loginButton.setOnClickListener {
            val identifier = indentifierTextfield.text.toString().trim()
            val password = passwordTextfield.text.toString().trim()
            viewModel.login(identifier, password)
        }

        signUpTextView.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }
}
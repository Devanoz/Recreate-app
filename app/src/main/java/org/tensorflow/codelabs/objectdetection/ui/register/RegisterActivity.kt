package org.tensorflow.codelabs.objectdetection.ui.register

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText
import org.tensorflow.codelabs.objectdetection.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    private val viewModel by viewModels<RegisterViewModel> { RegisterViewModelFactory(application) }


    private lateinit var usernameInput: TextInputEditText
    private lateinit var emailInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var repeatPasswordInput: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usernameInput = binding.usernameTextfield
        emailInput = binding.emailTextfield
        passwordInput = binding.passwordTextfield
        repeatPasswordInput = binding.repeatPasswordTextfield

        val signupButton = binding.signupButton

        val linearProgressBar = binding.linearProgressBar

        viewModel.linearProgressBarVisibillity.observe(this) { isShowing ->
            linearProgressBar.visibility = if(isShowing) View.VISIBLE else View.INVISIBLE
        }

        signupButton.setOnClickListener {
            viewModel.register(
                username = usernameInput.text.toString(),
                email = emailInput.text.toString(),
                password = passwordInput.toString()
            )
        }
        setRegisterValidation()
    }

    private fun setRegisterValidation() {
        emailInput.addTextChangedListener {
            if(!isValidEmail(it.toString())) {
                emailInput.error = "Email is not Valid"
            }
        }
    }

    private fun isValidEmail(target: CharSequence): Boolean {
        return if (TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target).matches()
        }
    }
}
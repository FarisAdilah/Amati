package com.dicoding.amati.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.amati.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnSignup.setOnClickListener { signUp() }
        binding.btnGoogleLogin.setOnClickListener { googleLogin() }
        binding.btnLogin.setOnClickListener { login() }
    }

    private fun login() {
        TODO("Not yet implemented")
    }

    private fun googleLogin() {
        TODO("Not yet implemented")
    }

    private fun signUp() {
        TODO("Not yet implemented")
    }
}
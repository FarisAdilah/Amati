package com.dicoding.amati.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.amati.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnLogin.setOnClickListener { login() }
        binding.btnGoogleLogin.setOnClickListener { googleLogin() }
        binding.btnRegister.setOnClickListener { register() }
    }

    private fun register() {
        TODO("Not yet implemented")
    }

    private fun googleLogin() {
        TODO("Not yet implemented")
    }

    private fun login() {
        TODO("Not yet implemented")
    }
}
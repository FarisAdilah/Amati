package com.dicoding.amati.ui.login

import androidx.appcompat.app.AppCompatActivity
import com.dicoding.amati.R


import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()
    }
}
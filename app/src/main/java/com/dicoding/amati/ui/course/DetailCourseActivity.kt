package com.dicoding.amati.ui.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.amati.databinding.ActivityDetailCourseBinding

class DetailCourseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailCourseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCourseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnBack.setOnClickListener {
            // intent(?)
        }
    }
}
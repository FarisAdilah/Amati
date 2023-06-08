package com.dicoding.amati.ui.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.amati.databinding.ActivityCourseListBinding

class CourseListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCourseListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCourseListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        TODO("Not yet implemented")
    }
}
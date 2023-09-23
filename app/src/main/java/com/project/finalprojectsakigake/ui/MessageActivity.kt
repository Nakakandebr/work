package com.project.finalprojectsakigake.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {
    lateinit var binding: ActivityMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

//    override fun onResume() {
//        super.onResume()
//    }
}
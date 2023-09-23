package com.project.finalprojectsakigake.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityMainBinding
import com.project.finalprojectsakigake.databinding.ActivityPlantsBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    @SuppressLint("SuspiciousIndentation")
    override fun onResume() {
        super.onResume()
        binding.btnGetstarted.setOnClickListener{
          val intent =  Intent(this ,SubjectChoosenAssignments::class.java)
            startActivity(intent)
        }

    }


}

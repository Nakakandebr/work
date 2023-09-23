package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityPlantsBinding
import com.project.finalprojectsakigake.databinding.ActivityShopsBinding


class ShopsActivity : AppCompatActivity() {
    lateinit var binding :ActivityShopsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnPanga.setOnClickListener{
            val intent =Intent(this , MessageActivity::class.java)
            startActivity(intent)
        }


    }
}
package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityEditAssignmentBinding

class EditAssignment : AppCompatActivity() {
    lateinit var binding :ActivityEditAssignmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding = ActivityEditAssignmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnPostAssignment.setOnClickListener{
            val intent =  Intent(this , PlantsActivity::class.java)
            startActivity(intent)
        }
        binding.ivcancel.setOnClickListener{
            val intent =  Intent(this , SubjectChoosenAssignments::class.java)
            startActivity(intent)
        }

        binding.imageView5.setOnClickListener{
            val intent =  Intent(this ,SubjectChoosenAssignments::class.java)
            startActivity(intent)
        }



    }
}
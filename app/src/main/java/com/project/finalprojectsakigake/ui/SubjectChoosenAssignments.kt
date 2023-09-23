
package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivitySubjectChoosenAssignmentsBinding
import com.project.finalprojectsakigake.models.Topics

class SubjectChoosenAssignments : AppCompatActivity() {
    lateinit var binding: ActivitySubjectChoosenAssignmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubjectChoosenAssignmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.rvAssignmentTopics
        val topics = listOf(
            Topics("Plants - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth.", "Posted at 25/12/2023" ),
            Topics("Animals - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth.", "Posted at 25/12/2023"),
            Topics("Farm Tools - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth", "Posted at 25/12/2023"),
            Topics("Weeds - ", "Due: 10th Nov", "In this assignment, you will explore the world of plants and learn about their basic needs for growth.", "Posted at 25/12/2023")
        )

        val adapter = SubjectChoosenAssignmentsAdapter(topics)
        recyclerView.adapter = adapter

        binding.Add.setOnClickListener {
            val intent = Intent(this, EditAssignment::class.java)
            startActivity(intent)
        }
    }
}
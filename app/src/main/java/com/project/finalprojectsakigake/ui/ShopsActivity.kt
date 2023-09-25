package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.finalprojectsakigake.Database.Resource
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityPlantsBinding
import com.project.finalprojectsakigake.databinding.ActivityShopsBinding


class ShopsActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopsBinding
    lateinit var resourceAdapter: ResourceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.rvresources
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val buttons = listOf(
            Resource("Panga"),
            Resource("Jembe"),
            Resource("Seedlings"),
            Resource("DustCoat"),
            Resource("Gumboots")
        )

        val adapter = ResourceAdapter(buttons)
        recyclerView.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        binding.ivarrow2.setOnClickListener {
            val intent = Intent(this, PlantsActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.finalprojectsakigake.databinding.ActivityPlantsBinding

class PlantsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlantsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnGumboots.setOnClickListener{
    val intent =Intent(this, ShopsActivity::class.java)
    startActivity(intent)

}


    }



}




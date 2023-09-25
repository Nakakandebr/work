package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.finalprojectsakigake.Database.MessageDetails
import com.project.finalprojectsakigake.Database.Resource
import com.project.finalprojectsakigake.databinding.ActivityPlantsBinding

class PlantsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlantsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onResume()

        binding.ivsend.setOnClickListener {
            val intent= Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }

        val recyclerview=binding.rvresources

        val resource = listOf(
            Resource("Panga"),
            Resource("gumboots"),
            Resource("knife"),
            Resource("razor"),
            Resource("scissors")
            )

        val adapter= ResourceAdapter(resource)
        recyclerview.adapter=adapter
//        recyclerview.layoutManager= LinearLayoutManager.HORIZONTAL(this)


//        binding.btnGumboots.setOnClickListener{
//            val intent =Intent(this, ShopsActivity::class.java)
//            startActivity(intent)
//        }
    }



    override fun onResume() {
        super.onResume()



    }



}




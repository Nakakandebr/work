package com.project.finalprojectsakigake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.finalprojectsakigake.Database.MessageDetails
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.ActivityCommentsBinding
import com.project.finalprojectsakigake.databinding.ActivityMessageBinding

class CommentsActivity : AppCompatActivity() {
    lateinit var binding: ActivityCommentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_comments)

        val recyclerview=binding.recyclerView
        val messages = listOf(
            MessageDetails("Karina ", "https://res.cloudinary.com/dtu8pkzkp/image/upload/v1695495267/kkm0poo4pdqdbjrgoj2t.png", "good work" ),
            MessageDetails("Maria ", "https://res.cloudinary.com/dtu8pkzkp/image/upload/v1695495267/kkm0poo4pdqdbjrgoj2t.png", "good work" ),
            MessageDetails("Vandar ", "https://res.cloudinary.com/dtu8pkzkp/image/upload/v1695495267/kkm0poo4pdqdbjrgoj2t.png", "good work" ),
            MessageDetails("Nicky - ", "https://res.cloudinary.com/dtu8pkzkp/image/upload/v1695495267/kkm0poo4pdqdbjrgoj2t.png", "good work" ),
            MessageDetails("Kamau- ", "https://res.cloudinary.com/dtu8pkzkp/image/upload/v1695495267/kkm0poo4pdqdbjrgoj2t.png", "good work" ),
            MessageDetails("Visha ", "https://res.cloudinary.com/dtu8pkzkp/image/upload/v1695495267/kkm0poo4pdqdbjrgoj2t.png", "good work" )
        )
        val adapter= MessageAdapter(messages)
        recyclerview.adapter=adapter

        binding.ivbackmssg.setOnClickListener {
            startActivity(Intent(this, PlantsActivity::class.java))
        }
    }
    }

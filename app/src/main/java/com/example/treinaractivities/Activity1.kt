package com.example.treinaractivities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.treinaractivities.databinding.Activity1Binding
import com.example.treinaractivities.databinding.ActivityMainBinding

class Activity1 : AppCompatActivity() {
    private lateinit var binding: Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {
        binding.button.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}
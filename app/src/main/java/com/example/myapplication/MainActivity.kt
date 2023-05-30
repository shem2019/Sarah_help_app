package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next_activity_button=findViewById<Button>(R.id.button)
        next_activity_button.setOnClickListener{
            val intent=Intent(this,activity2::class.java)
            startActivity(intent)


        }
    }
}
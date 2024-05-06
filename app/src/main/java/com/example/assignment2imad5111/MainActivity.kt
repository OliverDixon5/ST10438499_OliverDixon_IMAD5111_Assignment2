package com.example.assignment2imad5111

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToActivityMain2Button = findViewById<Button>(R.id.goToActivityMain2Button)

        goToActivityMain2Button.setOnClickListener {
            val intentGoToActivityMain2Button = Intent(this, MainActivity2::class.java)
            startActivity(intentGoToActivityMain2Button)

        }
    }
}


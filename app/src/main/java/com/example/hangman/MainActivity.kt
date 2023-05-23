package com.example.hangman

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playButton: Button = findViewById(R.id.playButton)
        val showScore: Button = findViewById(R.id.showScore)

        playButton.setOnClickListener {
            val intend = Intent(this, GameLayout::class.java)
            startActivity(intend)
        }
    }







}
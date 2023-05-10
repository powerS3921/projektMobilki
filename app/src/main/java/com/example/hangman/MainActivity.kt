package com.example.hangman

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

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
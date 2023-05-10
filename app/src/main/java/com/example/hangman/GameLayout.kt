package com.example.hangman

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class GameLayout : AppCompatActivity() {


    private lateinit var wordView: TextView
    private lateinit var usedLetterView: TextView
    private lateinit var imgView: ImageView
    private lateinit var lostGameView: TextView
    private lateinit var wonGameView: TextView
    private lateinit var buttonNewGame: Button
    private lateinit var lettersToUse: ConstraintLayout
    private lateinit var buttonPrevious: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_layout)
        imgView = findViewById(R.id.imgView)
        wordView = findViewById(R.id.wordView)
        usedLetterView = findViewById(R.id.usedLetterView)
        lostGameView = findViewById(R.id.lostGameView)
        wonGameView = findViewById(R.id.wonGameView)
        buttonNewGame = findViewById(R.id.buttonNewGame)
        lettersToUse = findViewById(R.id.lettersToUse)
        buttonPrevious = findViewById(R.id.buttonPrevious)
    }


}
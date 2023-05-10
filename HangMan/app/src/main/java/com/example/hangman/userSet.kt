package com.example.hangman

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class userSet : AppCompatActivity(){
    private lateinit var textUserSet: TextView
    private lateinit var userName : EditText
    private lateinit var buttonUserSet: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_set_layout)
        textUserSet = findViewById(R.id.textUserSet)
        userName = findViewById(R.id.userName)
        buttonUserSet = findViewById(R.id.buttonUserSet)
    }
}
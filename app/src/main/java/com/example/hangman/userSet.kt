package com.example.hangman

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class userSet : AppCompatActivity() {

    private lateinit var userName: EditText
    private lateinit var selectImageButton: Button
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_set_layout)

        userName = findViewById(R.id.userName)
        selectImageButton = findViewById(R.id.selectImageButton)
        submitButton = findViewById(R.id.buttonUserSet)
        }


}
package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val startButton = findViewById<Button>(R.id.startGame);
        startButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }

        val quitButton = findViewById<Button>(R.id.buttonQuit);
        quitButton.setOnClickListener{
            finishAndRemoveTask();
        }
    }
}
package com.example.worldofoneadventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_title_screen.*


class TitleScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_screen)

        startButton.setOnClickListener{

            val input = titleUserName.text.toString().trim()

            if (input.isEmpty()) {
                Toast.makeText(this, "Name is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (input.length > 30) {
                Toast.makeText(this, "Name is too long", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            Toast.makeText(this, "$input entered", Toast.LENGTH_SHORT).show()

            val Intent = Intent(this, GameScreen::class.java)
            Intent.putExtra("user", input)
            startActivity(Intent)
        }

    }
}
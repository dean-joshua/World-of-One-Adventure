package com.example.worldofoneadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_screen.*

class GameScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)


        val story = Story(this)

        story.playerName = intent.getStringExtra("user").toString()

        choiceButton1.setOnClickListener{
            story.goNext(story.next1)
        }
        choiceButton2.setOnClickListener{
            story.goNext(story.next2)
        }
        choiceButton3.setOnClickListener{
            story.goNext(story.next3)
        }
        choiceButton4.setOnClickListener{
            story.goNext(story.next4)
        }

        story.startingPoint()
    }
}
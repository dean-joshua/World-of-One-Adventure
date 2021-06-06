package com.example.worldofoneadventure

import android.view.View
import kotlinx.android.synthetic.main.activity_game_screen.*

class Story(val gs : GameScreen) {

    var playerName = ""
    var playerLevel = "1"
    var playerExp = 0
    var playerMaxHealth = "100"
    var playerCurrentHealth = "100"
    var playerClass = ""
    var playerDamage = 10
    var playerAbility1 = ""
    var playerAbility2 = ""

    var next1 = ""
    var next2 = ""
    var next3 = ""
    var next4 = ""

    fun goNext(position: String){

        when(position){

            "startingPoint" -> startingPoint()
            "town" -> town()
            "disappoint" -> disappoint()
            "rest" -> rest()
            "look" -> lookAround()
            "adventure" -> adventure()
            "learn" -> learnMore()
            "dead" -> theEnd()


        }

    }

    fun startingPoint(){

        gs.gameImageView.setImageResource(R.drawable.female08)
        gs.gamePlayerNameText.setText(playerName)
        gs.gamePlayerCurrLevelText.setText(playerLevel)
        gs.gamePlayerCurrHealthText.setText(playerCurrentHealth)

        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Welcome to the World of One, $playerName! We have awaited your arrival for centuries.
            As we speak, monsters are destroying our towns and killing our people.
            Only you can bring balance by defeating them. 
            
            Will you fight for us, $playerName?
        """.trimIndent())

        gs.choiceButton1.setText("Of course!")
        gs.choiceButton2.setText("No, I'm good.")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "town"
        next2 = "disappoint"
        next3 = ""
        next4 = ""

    }

    fun town(){

        gs.gameImageView.setImageResource(R.drawable.rpgtown)
        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Whisper: You will be the one to save us! I just know it!
            *You open your eyes and see a sprawling town in front of you^
            It looks like there are tons of things you can try doing.
            
            What will you do?           
        """.trimIndent())

        gs.choiceButton1.setText("Rest")
        gs.choiceButton2.setText("Look Around")
        gs.choiceButton3.setText("Adventure!!!")
        gs.choiceButton4.setText("Learn More")
        gs.choiceButton3.setVisibility(View.VISIBLE)
        gs.choiceButton4.setVisibility(View.VISIBLE)

        next1 = "rest"
        next2 = "look"
        next3 = "adventure"
        next4 = "learn"

    }

    fun disappoint(){

        gs.gameImageView.setImageResource(R.drawable.female02)
        playerCurrentHealth = "0"
        gs.gamePlayerCurrHealthText.setText(playerCurrentHealth)
        gs.gameTextView.setText("""
            *The woman before you appears a bit disgusted with you and her appearance changes*           
            You are worthless. If you will not fight for us. I curse your family
            with everlasting shame and dishonor. Be gone!
            
            *Energy begins to streak around the woman like lightning and with a point
            of her finger your existence ceases*
        """.trimIndent())

        gs.choiceButton1.setText("Be obliterated!")
        gs.choiceButton2.setText("Try again!")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "dead"
        next2 = "startingPoint"
        next3 = ""
        next4 = ""
    }

    fun rest(){

        gs.gameImageView.setImageResource(R.drawable.female08)
        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Welcome to the World of One, $playerName! We have awaited your arrival for centuries.
            As we speak, monsters are destroying our towns and killing our people.
            Only you can bring balance by defeating them. 
            
            Will you fight for us, $playerName?
        """.trimIndent())

        gs.choiceButton1.setText("Of course!")
        gs.choiceButton2.setText("No, I'm good.")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "town"
        next2 = "disappoint"
        next3 = ""
        next4 = ""

    }

    fun lookAround(){

        gs.gameImageView.setImageResource(R.drawable.female08)
        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Welcome to the World of One, $playerName! We have awaited your arrival for centuries.
            As we speak, monsters are destroying our towns and killing our people.
            Only you can bring balance by defeating them. 
            
            Will you fight for us, $playerName?
        """.trimIndent())

        gs.choiceButton1.setText("Of course!")
        gs.choiceButton2.setText("No, I'm good.")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "town"
        next2 = "disappoint"
        next3 = ""
        next4 = ""

    }

    fun adventure(){

        gs.gameImageView.setImageResource(R.drawable.female08)
        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Welcome to the World of One, $playerName! We have awaited your arrival for centuries.
            As we speak, monsters are destroying our towns and killing our people.
            Only you can bring balance by defeating them. 
            
            Will you fight for us, $playerName?
        """.trimIndent())

        gs.choiceButton1.setText("Of course!")
        gs.choiceButton2.setText("No, I'm good.")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "town"
        next2 = "disappoint"
        next3 = ""
        next4 = ""

    }

    fun learnMore(){

        gs.gameImageView.setImageResource(R.drawable.female08)
        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Welcome to the World of One, $playerName! We have awaited your arrival for centuries.
            As we speak, monsters are destroying our towns and killing our people.
            Only you can bring balance by defeating them. 
            
            Will you fight for us, $playerName?
        """.trimIndent())

        gs.choiceButton1.setText("Of course!")
        gs.choiceButton2.setText("No, I'm good.")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "town"
        next2 = "disappoint"
        next3 = ""
        next4 = ""

    }

    fun theEnd(){

        gs.gameImageView.setImageResource(R.drawable.female08)
        gs.gameTextView.setText("""
            *A bright light envelops you and fades away^
            Welcome to the World of One, $playerName! We have awaited your arrival for centuries.
            As we speak, monsters are destroying our towns and killing our people.
            Only you can bring balance by defeating them. 
            
            Will you fight for us, $playerName?
        """.trimIndent())

        gs.choiceButton1.setText("Of course!")
        gs.choiceButton2.setText("No, I'm good.")
        gs.choiceButton3.setText("")
        gs.choiceButton4.setText("")
        gs.choiceButton3.setVisibility(View.INVISIBLE)
        gs.choiceButton4.setVisibility(View.INVISIBLE)

        next1 = "town"
        next2 = "disappoint"
        next3 = ""
        next4 = ""

    }
}
package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    //lateinit the variable will be init and not leave as null
    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text="Let's Roll"

        //this will make the button clickable
        rollButton.setOnClickListener {
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        //find the correct id @ get a reference to the ImageView
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        // create a variable that content random number
        val randomInt = Random().nextInt(6) + 1
        //when expression same as if statement but much easier
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //display the result
        diceImage.setImageResource(drawableResource)
    }
}
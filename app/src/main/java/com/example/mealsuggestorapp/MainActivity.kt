package com.example.mealsuggestorapp

import android.health.connect.datatypes.MealType
import android.os.Bundle
import android.view.inputmethod.InlineSuggestion
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.CheckResult
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private lateinit var timeOfDayMealInput : EditText
    private lateinit var timeOfDayBeverageInput : EditText
    private lateinit var suggestedMeal : TextView
    private lateinit var suggestedMealbtn : Button
    private lateinit var suggestedBeverage :TextView
    private lateinit var suggestedBeveragebtn :Button
    private lateinit var resetBtn : Button
    private lateinit var exitBtn : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        timeOfDayMealInput = findViewById(R.id.timeOfDayMealInput)
        timeOfDayBeverageInput = findViewById(R.id.timeOfDayBeverageInput)
        suggestedMeal = findViewById(R.id.suggestedMeal)
        suggestedMealbtn = findViewById(R.id.suggestedMealBtn)
        suggestedBeverage = findViewById(R.id.suggestedBeverage)
        suggestedBeveragebtn = findViewById(R.id.suggestedBeverageBtn)
        resetBtn = findViewById(R.id.resetBtn)
        exitBtn = findViewById(R.id.exitBtn)



        suggestedMealbtn.setOnClickListener() {
            suggestedMeal()
        }
        suggestedBeveragebtn.setOnClickListener() {
            suggestedBeverage()
        }

        resetBtn.setOnClickListener() {
           handleResetButton()
        }
        exitBtn.setOnClickListener() {
           handleExitButton()
        }

    }


    private fun suggestedMeal() {
            val timeOfDay = timeOfDayMealInput.text.toString().trim().lowercase()

                 when (timeOfDay) {


                "morning" ->  print("ScrambledEggs")
                "mid-Morning snack" -> print("Fruit")
                "afternoon" -> print("Chicken Wrap")
                "late Afternoon snack" -> print("Nuts")
                "Dinner" -> print("Medium rare Steak")
                "Desert" -> print("Sorbet")

                else -> println( "Invalid entry")


            }
    }


    private fun  suggestedBeverage()  {
            val timeOfDay = timeOfDayBeverageInput. text.toString().trim().uppercase()

                when (timeOfDay) {


                "morning" -> print("You can have a Cup of Coffee")
                "mid Morning beverage" -> print("You can have a Strawberry Smoothie")
                "noon" -> print("Coca Cola")
                "late noon Beverage" -> print("tea")
                "dinner" -> print("Sparkling Water")

                else -> println("Invalid Entry")

            }

    }


    private fun handleResetButton() {
        timeOfDayMealInput.text.clear()
        suggestedMeal.text = ""
        timeOfDayBeverageInput.text.clear()
        suggestedBeverage.text = ""


    }

    private fun handleExitButton () {

    return

    }
}




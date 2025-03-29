package com.example.mealsuggestorapp

import android.health.connect.datatypes.MealType
import android.icu.util.Output
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
import kotlin.random.Random
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    private lateinit var timeOfDayMealInput : EditText
    private lateinit var timeOfDayBeverageInput : EditText
    private lateinit var recommendMealTextView: TextView
    private lateinit var recommendMealButton: Button
    private lateinit var recommendBeverageTextView: TextView
    private lateinit var recommendBeverageButton: Button
    private lateinit var resetButton: Button
    private lateinit var exitButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        timeOfDayMealInput = findViewById(R.id.timeOfDayMealInput)
        timeOfDayBeverageInput = findViewById(R.id.timeOfDayBeverageInput)
        recommendMealTextView = findViewById(R.id.suggestedMeal)
        recommendMealButton = findViewById(R.id.recommendMealButton)
        recommendBeverageTextView = findViewById(R.id.suggestedBeverage)
        recommendBeverageButton = findViewById(R.id.recommendBeverageButton)
        resetButton = findViewById(R.id.resetButton)
        exitButton = findViewById(R.id.exitButton)



        recommendMealButton.setOnClickListener() {
            recommendedMealButton()
        }
       recommendBeverageButton.setOnClickListener() {
            recommendedBeverageButton()
        }
        resetButton.setOnClickListener() {
           handleResetButton()
        }
        exitButton.setOnClickListener() {
           finishAffinity()
           exitProcess(0)

        }

    }

    private fun recommendedMealButton() {
        val timeOfDay = timeOfDayMealInput.text.toString().trim()
        if (timeOfDay.isEmpty()) {
            recommendMealTextView.text = "Error: Please type in a valid time of day."
            return
        }
        else {
            recommendMealTextView.text = "Error:Unable to recommend a meal for you."
        }

        val mealRecommended = when (timeOfDay) {
            "morning" -> listOf("scrambled eggs","muesli","pancakes")
            "midday" -> listOf("fruit salad","choc chip muffin","raisin","biscuit")
            "afternoon" -> listOf("chicken avo feta wrap","beef sandwich","steak&kidney pie")
            "late afternoon" -> listOf("macadamia nuts","yoghurt","Crisps")
            "evening" -> listOf("spaghetti and mince","lasagne","macaroni and cheese")
            "late evening" -> listOf("sorbet","vanilla ice cream","apple crumble")
            else -> {
               recommendMealTextView.text = "Input a valid Time of Day for Meal: $timeOfDay"
               return
            }
        }

         val  mealSuggested = mealRecommended.random()
       recommendMealTextView.text = "$mealSuggested"
    }



    private fun recommendedBeverageButton()  {
        val timeOfDay = timeOfDayBeverageInput.text.toString().trim()
        if(timeOfDay.isEmpty()) {
            recommendBeverageTextView.text = "Error: Please Type in a valid time of day."
            return
        }
        else{
            recommendBeverageTextView.text = "Error: Unable to recommend a beverage for you "
        }

        val beverageRecommended = when (timeOfDay) {
                "morning" -> listOf("coffee","cappuccino","espresso")
                "midday" ->  listOf("strawberry smoothie","banana smoothie", "apple smoothie")
                "afternoon" -> listOf("coca cola","creme soda","stoney")
                "late afternoon" -> listOf("tea","orange juice","apple juice")
                "evening" -> listOf("Red wine","white wine","champagne")
                "late evening" -> listOf("sparkling water","still water","chamomile tea")
                else -> {
                    println("Input a valid Time of Day for Beverage: $timeOfDay")
                    return

                }
        }
        val  beverageSuggested = beverageRecommended.random()
        recommendBeverageTextView.text = "$beverageSuggested"
    }



    private fun handleResetButton() {
        timeOfDayMealInput.text.clear()
        timeOfDayBeverageInput.text.clear()
        recommendMealTextView.text = ""
        recommendBeverageTextView.text = ""
        return

    }

}




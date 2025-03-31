package com.example.mealsuggestorapp
// kincade is the G//
import android.health.connect.datatypes.MealType
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    private lateinit var timePeriodMealInput : EditText
    private lateinit var timePeriodBeverageInput : EditText
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

            // kincade is the G//

        timePeriodMealInput = findViewById(R.id.timePeriodMealInput)
        timePeriodBeverageInput = findViewById(R.id.timePeriodBeverageInput)
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
           // this allows the user to exit the app
        }

    }

    private fun recommendedMealButton() {
        val timeOfDay = timePeriodMealInput.text.toString().trim()
        if (timeOfDay.isEmpty()) {
            recommendMealTextView.text = "Error: Please type in a valid time period: $timeOfDay."
            return
            // This message displays an error message in the Textview if the the EditText isEmpty when the recommend meal button is pressed//
        }

        // the value states that if the time of day equals to the time period the list of would display//
        val mealRecommended = if (timeOfDay == "morning") {
            listOf("scrambled eggs", "muesli", "pancakes")


        } else if (timeOfDay == "midday") {
            listOf("fruit salad", "choc chip muffin", "raisin", "biscuit")

        } else if (timeOfDay == "afternoon") {
            listOf("chicken avo feta wrap", "beef sandwich", "steak&kidney pie")

        } else if (timeOfDay == "late afternoon") {
            listOf("macadamia nuts", "yoghurt", "Crisps")

        } else if (timeOfDay == "evening") {
            listOf("spaghetti and mince", "lasagne", "macaroni and cheese")

        } else if (timeOfDay == "late evening") {
            listOf("sorbet", "vanilla ice cream", "apple crumble")

        } else  {
               recommendMealTextView.text = " Error: Please type in a valid time period: $timeOfDay."
               return

        }

         val  mealSuggested = mealRecommended.random()
       recommendMealTextView.text = "$mealSuggested"
    } // the mealRecommended.random() displays the list of meals at random when the recommended button is pressed//



    private fun recommendedBeverageButton()  {
        val timeOfDay = timePeriodBeverageInput.text.toString().trim()
        if(timeOfDay.isEmpty()) {
            recommendBeverageTextView.text = "Error: Please Type in a valid time of day: $timeOfDay."
            return
            //This message displays an error message in the recommendBeverageTextView if the EditText has not been edited after recommendBeverage button is clicked//
        }


        // the value states that if the time of day equals to the time period the list of recommended beverages would display//
        val beverageRecommended = if (timeOfDay == "morning") {
            listOf("coffee", "cappuccino", "espresso")
        }    else if (timeOfDay == "midday") {
            listOf("strawberry smoothie", "banana smoothie", "apple smoothie")

        }    else if (timeOfDay == "afternoon") {
            listOf("coca cola", "creme soda", "stoney")

        }    else if (timeOfDay == "late afternoon") {
            listOf("tea", "orange juice", "apple juice")

        }    else if (timeOfDay == "evening") {
            listOf("Red wine", "white wine", "champagne")

        }   else if (timeOfDay == "late evening") {
            listOf("sparkling water", "still water", "chamomile tea")

        }  else  {
                    recommendBeverageTextView.text =" Error: please type in a valid time period: $timeOfDay"
                    return

        }
        val  beverageSuggested = beverageRecommended.random()
        recommendBeverageTextView.text = "$beverageSuggested"
    }     // the beverageRecommended.random() displays the list of Beverages at random when the recommended button is clicked//


    // Resets the two EditTexts and TextViews//
    private fun handleResetButton() {
        timePeriodMealInput.text.clear()
        timePeriodBeverageInput.text.clear()
        recommendMealTextView.text = ""
        recommendBeverageTextView.text = ""
        return

    }

}




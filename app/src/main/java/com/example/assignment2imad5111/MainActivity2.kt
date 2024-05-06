package com.example.assignment2imad5111



import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    // defining the counting variables and privation them so there arnt any changes.
    private var clickHungerCount = 0
    private var clickHappyCount = 0
    private var clickWashingCount = 0
    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        // setting a placeholder image to change the images later and making the images a certain area so that they fit into the users screen.
        val placeholderImage = findViewById<ImageView>(R.id.placeholderImage)
        val layoutParams = placeholderImage.layoutParams
        layoutParams.width = 800
        layoutParams.height = 800
        placeholderImage.layoutParams = layoutParams

        // defining the buttons and setting them to variables
        val eatingButton = findViewById<Button>(R.id.feedButton)
        val playingButton = findViewById<Button>(R.id.playButton)
        val washingButton = findViewById<Button>(R.id.cleanButton)

        // defining the area that the text views where the count will be displayed.
        val hungerCount = findViewById<TextView>(R.id.hungerCount)
        val happyCount = findViewById<TextView>(R.id.happyCount)
        val washingCount = findViewById<TextView>(R.id.cleanCount)

        // displaying the placeholder image
        placeholderImage.setImageResource(R.drawable.snoopy_png95)

        // setting the image to change to the eating image if the feed button is pressed and the counter will increment by 1 and be displayed.
        eatingButton.setOnClickListener {
            placeholderImage.setImageResource(R.drawable.eatingimage1)
            clickHungerCount++
            hungerCount.text = clickHungerCount.toString()
        }

        // setting the image to change to the playing image if the play button is pressed and the counter will increment by 1 and be displayed.
        playingButton.setOnClickListener {
            placeholderImage.setImageResource(R.drawable.playingimage1)
            clickHappyCount++
            happyCount.text = clickHappyCount.toString()
        }

        // setting the image to change to the washing image if the clean button is pressed and the counter will increment by 1 and be displayed.
        washingButton.setOnClickListener {
            placeholderImage.setImageResource(R.drawable.washingimage1)
            clickWashingCount++
            washingCount.text = clickWashingCount.toString()
        }
    }
}
package com.example.assignment2imad5111



import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    private var clickHungerCount = 0
    private var clickHappyCount = 0
    private var clickWashingCount = 0
    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val placeholderImage = findViewById<ImageView>(R.id.placeholderImage)
        val layoutParams = placeholderImage.layoutParams
        layoutParams.width = 800
        layoutParams.height = 800
        placeholderImage.layoutParams = layoutParams

        val eatingButton = findViewById<Button>(R.id.feedButton)
        val playingButton = findViewById<Button>(R.id.playButton)
        val washingButton = findViewById<Button>(R.id.cleanButton)

        val hungerCount = findViewById<TextView>(R.id.hungerCount)
        val happyCount = findViewById<TextView>(R.id.happyCount)
        val washingCount = findViewById<TextView>(R.id.cleanCount)

        placeholderImage.setImageResource(R.drawable.snoopy_png95)

        eatingButton.setOnClickListener {
            placeholderImage.setImageResource(R.drawable.eatingimage1)
            clickHungerCount++
            hungerCount.text = clickHungerCount.toString()
        }
        playingButton.setOnClickListener {
            placeholderImage.setImageResource(R.drawable.playingimage1)
            clickHappyCount++
            happyCount.text = clickHappyCount.toString()
        }
        washingButton.setOnClickListener {
            placeholderImage.setImageResource(R.drawable.washingimage1)
            clickWashingCount++
            washingCount.text = clickWashingCount.toString()
        }
    }
}
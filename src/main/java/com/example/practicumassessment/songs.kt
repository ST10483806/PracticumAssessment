package com.example.practicumassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class songs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs)

        val songView = findViewById<TextView>(R.id.songView)
        val displayButton = findViewById<Button>(R.id.displayButton)
        val averageButton = findViewById<Button>(R.id.averageButton)
        val backButton = findViewById<Button>(R.id.backButton)

        //A list of the songs and their details
        val songslist = listOf(
            "Forever ever, Trippie Redd, 3, HipHop/Rap",
            "Smooth Operator, Sade, 5, Smooth Jazz",
            "Not Like Us, Kendrick Lamar, 5, Rap/HipHop",
            "Dlala Ka Yone, DJ Maphorisa, 4, Amapiano"

        )

        //The button will display the songs with all its corresponding categories

        displayButton.setOnClickListener {

            val songText = StringBuilder()
            for (i in songslist.indices){
                songText.append("Song ${i + 1}: ${songslist[i]}\n")
                songView.text = songText.toString()
            }


        }
        averageButton.setOnClickListener {


        }

        //This button will take the user back to the first page
        backButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.practicumassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// ST10483806 Gomolemo Molebogeng Motlhabane

        //Find variables by their id's on the user interface
        val titleText = findViewById<EditText>(R.id.titleText)
        val artistText = findViewById<EditText>(R.id.artistText)
        val ratingText = findViewById<EditText>(R.id.ratingText)
        val commentsText = findViewById<EditText>(R.id.commentsText)
        val addButton = findViewById<Button>(R.id.addButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.exitButton)




        // Will add and record all the details to playlist

        addButton.setOnClickListener {
            try {
                val title = titleText.text.toString()
                val artist = artistText.text.toString()
                val rating = ratingText.text.toString().toInt()
                val comments = commentsText.text.toString()

                if (title.isEmpty() || artist.isEmpty() || comments.isEmpty()) {
                    Toast.makeText(this , "Please fill all fields!" , Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                // Create a local list instead
                val savedsongs = mutableListOf<String>().apply {
                    add("title: $title")
                    add("artist: $artist")
                    add("rating: $rating")
                    add("comments: $comments")
                }

                titleText.text.clear()
                artistText.text.clear()
                ratingText.text.clear()
                commentsText.text.clear()

                Toast.makeText(this , "Item added!" , Toast.LENGTH_LONG).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this , "Invalid quantity!" , Toast.LENGTH_LONG).show()
            }
        }

        // Button will take user to the next page
        nextButton.setOnClickListener {


                val intent = Intent(this , songs::class.java)
                startActivity(intent)
            }

            // This button will exit the app when clicked by the user
            exitButton.setOnClickListener {
                finishAffinity()
            }

        }
    }




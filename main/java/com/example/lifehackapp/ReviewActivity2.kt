package com.example.lifehackapp

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val layout = findViewById<LinearLayout>(R.id.reviewLayout)



        val questions = arrayOf(

            "Putting your phone in rice fixes water damage",

            "Using keyboard shortcuts improves productivity",

            "Drinking coffee completely dehydrates you",

            "Writing tasks down improves memory",

            "Charging phone overnight destroys battery"

        )



        val answers = arrayOf(false, true, false, true, false)



        for (i in questions.indices) {

            val tv = TextView(this)

            val answerText = if (answers[i]) "Hack" else "Myth"

            tv.text = "${questions[i]}\nAnswer: $answerText\n"

            tv.setPadding(0, 0, 0, 20)

            layout.addView(tv)

        }

    }

}
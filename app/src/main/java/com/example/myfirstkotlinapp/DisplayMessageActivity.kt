package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val textView = findViewById<TextView>(R.id.textView)

        var wordHolder = arrayListOf<String>()
        wordHolder = intent.getStringArrayListExtra("wordList")

        for (item in wordHolder)
            textView.append(item)

        //Randomize the "8 Ball message"
        var answer1 = "Yes, of course!"
        var answer2 = "Surely not!"
        var answer3 = "Maybe, who knows?"
        var random = (1..3).shuffled().last()
        if (random == 1)
        {
            val answerView = findViewById<TextView>(R.id.textView2).apply {
                text = answer1
            }
        }
        else if (random == 2)
        {
            val answerView = findViewById<TextView>(R.id.textView2).apply {
                text = answer2
            }
        }
        else if (random == 3) {
            val answerView = findViewById<TextView>(R.id.textView2).apply {
                text = answer3
            }
        }

    }

}

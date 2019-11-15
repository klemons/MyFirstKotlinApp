package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import kotlinx.android.synthetic.*
import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val textView1 = findViewById<TextView>(R.id.input1)
        val textView2 = findViewById<TextView>(R.id.input2)
        val textView3 = findViewById<TextView>(R.id.input3)
        val textView4 = findViewById<TextView>(R.id.input4)
        val textView5 = findViewById<TextView>(R.id.input5)
        val textView6 = findViewById<TextView>(R.id.input6)
        val textView7 = findViewById<TextView>(R.id.input7)
        val textView8 = findViewById<TextView>(R.id.input8)

        var wordHolder = arrayListOf<String>()
        wordHolder = intent.getStringArrayListExtra("wordList")

        for (i in wordHolder.indices) {
            when (i) {
                0 -> textView1.append(wordHolder[0])
                1 -> textView2.append(wordHolder[1])
                2 -> textView3.append(wordHolder[2])
                3 -> textView4.append(wordHolder[3])
                4 -> textView5.append(wordHolder[4])
                5 -> textView6.append(wordHolder[5])
                6 -> textView7.append(wordHolder[6])
                7 -> textView8.append(wordHolder[7])
            }
        }


    }

}

package com.example.myfirstkotlinapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var madLibList = arrayListOf<String>("","","","","","","","")
    var count = 0;

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val wordText = findViewById<TextView>(R.id.wordText)

        when (count) {
            0 -> wordText.setText(R.string.noun)
            1 -> wordText.setText(R.string.adjective)
            2 -> wordText.setText(R.string.plural_noun)
            3 -> wordText.setText(R.string.plural_noun)
            4 -> wordText.setText(R.string.adjective)
            5 -> wordText.setText(R.string.noun)
            6 -> wordText.setText(R.string.noun)
        }

        madLibList[count] = editText.text.toString()
        count++
        if (count == 8) {
            finishMadLib(madLibList)
        }
    }

    fun finishMadLib(mutableList: ArrayList<String>) {
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra("wordList", mutableList)
        }
        startActivity(intent)
    }

}

package com.example.myfirstkotlinapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var madLibList = arrayListOf<String>()
    var count = 0;

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
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

package com.example.myfirstkotlinapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
    }

    fun finishMadLib(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {}
        startActivity(intent)
    }

}

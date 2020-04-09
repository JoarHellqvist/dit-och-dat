package com.example.dummyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getSerializableExtra("DUMMY_DATA") as DummyData

        val receivedText = message.string
        val receivedCount = message.int.toString()

        val textView: TextView = findViewById(R.id.text_receivedText)
        val countView: TextView = findViewById(R.id.text_receivedCount)

        textView.text = receivedText
        countView.text = receivedCount

        println("$receivedText and $receivedCount")
    }
}

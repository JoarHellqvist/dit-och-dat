package com.example.dummyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_counter.setOnClickListener {
            incrementCounter()
        }

        btn_forward.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage(){
        val freeText = this.findViewById<TextView>(R.id.editText).text.toString()
        val message = DummyData(count, freeText)

        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("DUMMY_DATA", message)
        }
        this.startActivity(intent)
    }

    private fun incrementCounter() {
        count++
        val counterText = this.findViewById<TextView>(R.id.text_counter)
        counterText.text = count.toString()
    }
}

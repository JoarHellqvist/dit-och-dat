package com.example.dummyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_counter.setOnClickListener {
            increaseCount()
        }

        btn_forward.setOnClickListener {
            // TODO: Package the data
            //  And send it to the other activity.

            sendMessage()
        }
    }

    private fun sendMessage(){
        val freeText = this.findViewById<TextView>(R.id.editText).text.toString()
        val message = DummyData(count, freeText)

        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("data", message)
        }
        this.startActivity(intent)
    }

    private fun increaseCount() {
        count++
        val counterText = this.findViewById<TextView>(R.id.text_counter)
        counterText.text = count.toString()
    }
}

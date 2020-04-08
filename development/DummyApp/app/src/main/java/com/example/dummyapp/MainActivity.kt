package com.example.dummyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
            movePage()
        }
    }

    private fun movePage(view: View){
        // TODO: Package the data

        val changePage = Intent(this, MainActivity::class.java)
        startActivity(changePage)
    }

    private fun increaseCount() {
        count++
        val counterText = this.findViewById<TextView>(R.id.text_counter)
        counterText.text = count.toString()
    }
}

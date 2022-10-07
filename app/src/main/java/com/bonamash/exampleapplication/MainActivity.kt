package com.bonamash.exampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val tvName = findViewById<TextView>(R.id.tvName)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked++
            tvName.text = timesClicked.toString()
            Toast.makeText(this, "Toaster!!", Toast.LENGTH_LONG).show()
        }
    }
}
package com.example.aib3buttons

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class theNewActivity :AppCompatActivity() {
    lateinit var TV:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitythree)

        val profileName=intent.getStringExtra("userinput")
        TV.text=profileName






    }
}
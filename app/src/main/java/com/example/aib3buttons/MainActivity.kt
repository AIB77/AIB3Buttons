package com.example.aib3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var th1EDT: EditText
    lateinit var t1BTN:Button

    lateinit var th2EDT:EditText
    lateinit var t2BTN:Button
    lateinit var t2TV:TextView

    lateinit var t3EDT:EditText
    lateinit var t3BTN:Button
    lateinit var userinput2:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        th1EDT=findViewById(R.id.editTextone)
        t1BTN=findViewById(R.id.buttonone)

        th2EDT=findViewById(R.id.editTexttwo)
        t2BTN=findViewById(R.id.buttontwo)
        t2TV=findViewById(R.id.thetextView)

        t3EDT=findViewById(R.id.editTextthree)
        t3BTN=findViewById(R.id.buttonthree)

        t1BTN.setOnClickListener {
            Toast.makeText(this," ${th1EDT.text}",Toast.LENGTH_LONG).show()
        }
        t2BTN.setOnClickListener {
            userinput2=th2EDT.text.toString()
            t2TV.text=userinput2
        }


        // My app crashes when start new activity
        var userinput3:String
        t3BTN.setOnClickListener {

            userinput3=t3EDT.text.toString()

            val intent = Intent(this, theNewActivity::class.java)
            intent.putExtra("userinput", userinput3)
            startActivity(intent)



        }

    }
}
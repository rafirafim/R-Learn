package com.rafi.r_learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Maths : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths)

        var mathch1=findViewById<Button>(R.id.chap1)
        mathch1.setOnClickListener {
            var intent=Intent(applicationContext,math_ch1::class.java)
            startActivity(intent)
        }
    }
}

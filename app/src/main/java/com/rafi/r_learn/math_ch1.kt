package com.rafi.r_learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class math_ch1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_ch1)
        var ex1_1=findViewById<Button>(R.id.ex1_1)
        var em1_1=findViewById<Button>(R.id.em1_1)
        ex1_1.setOnClickListener {
            var intent=Intent(applicationContext,com.rafi.r_learn.ex1_1::class.java)
            startActivity(intent)
        }
        em1_1.setOnClickListener {
            var intent=Intent(applicationContext,com.rafi.r_learn.em1_1::class.java)
            startActivity(intent)
        }


    }
}

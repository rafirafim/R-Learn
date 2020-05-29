package com.rafi.r_learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var math=findViewById<ImageButton>(R.id.maths)
        math.setOnClickListener {
            var intent= Intent(applicationContext,Maths::class.java)
            startActivity(intent)
        }
    }
}

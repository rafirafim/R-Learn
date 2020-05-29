package com.rafi.r_learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name=findViewById<EditText>(R.id.name)
        var uname=findViewById<EditText>(R.id.uname)
        var password=findViewById<EditText>(R.id.pass)
        var loginbutton=findViewById<Button>(R.id.login)

        loginbutton.setOnClickListener {
            var getname=name.text.toString()
            var getuname=uname.text.toString()
            var getpass=password.text.toString()


            if(getuname.equals("admin")&&(getpass.equals("pass")) )
            {
                Toast.makeText(applicationContext,"Hai",Toast.LENGTH_SHORT).show()
                Toast.makeText(applicationContext,getname,Toast.LENGTH_SHORT).show()
                Toast.makeText(applicationContext,"Welcome to R-Learn, Pleas wait......",Toast.LENGTH_LONG).show()
                var intent= Intent(applicationContext,Home::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext,"Failed",Toast.LENGTH_LONG).show()

            }
        }


    }
}

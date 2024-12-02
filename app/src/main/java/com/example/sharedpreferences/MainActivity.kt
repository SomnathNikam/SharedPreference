package com.example.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editName: EditText
    lateinit var editPassword: EditText
    lateinit var Savebtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName=findViewById(R.id.eTName)
        editPassword=findViewById(R.id.eTPassword)
        Savebtn = findViewById(R.id.SaveLogin)

        Savebtn.setOnClickListener {

            val sharedPref = getSharedPreferences("Login Data", MODE_PRIVATE)
            val editor = sharedPref.edit()
            val n =editName.text.toString()
            val p  =editPassword.text.toString()
            editor.putString("Name",n)
            editor.putString("Password",p)
            editor.apply()

            Toast.makeText(this,"Data Saved Succsfully",Toast.LENGTH_SHORT).show()

            val i = Intent(this,MainActivity2::class.java)
            startActivity(i)
        }


    }
}
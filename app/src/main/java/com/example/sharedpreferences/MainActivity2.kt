package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var ShowText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        ShowText = findViewById(R.id.textView2)

        val sharedPref = getSharedPreferences("Login Data", MODE_PRIVATE)
        val name = sharedPref.getString("Name","")
        val password=sharedPref.getString("Password","")

        ShowText.text= "Name: $name \n Password:$password"

    }
}
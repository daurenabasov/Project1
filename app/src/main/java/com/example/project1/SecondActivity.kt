package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.project1.R

class SecondActivity2 : AppCompatActivity() {
    lateinit var text: TextView
    lateinit var btn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        text = findViewById(R.id.text)
        btn = findViewById(R.id.btn)

        val a = intent.getStringExtra("Name")
        val b = intent.getStringExtra("Surname")

        text.text =  "ФИО:\n $a \n $b"

        btn.setOnClickListener {
            onBackPressed()
        }
    }
}
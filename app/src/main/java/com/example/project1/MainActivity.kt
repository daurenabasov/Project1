package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.project1.R

class MainActivity : AppCompatActivity() {
    lateinit var a: EditText
    lateinit var b: EditText
    lateinit var c: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = findViewById(R.id.name)
        b = findViewById(R.id.surname)
        c = findViewById(R.id.btn)

        c.setOnClickListener{
            val textName = a.text.toString()
            val textSurname = b.text.toString()
            val intent = Intent(this, SecondActivity2::class.java)

            if (a.text.toString().trim().isEmpty() || b.text.toString().trim().isEmpty()) {
                val toast = Toast.makeText(this, "Заполните поле", Toast.LENGTH_LONG).show()
            } else {
                intent.putExtra("Name", a.text.toString())
                intent.putExtra("Surname", b.text.toString())
                startActivity(intent)
            }
        }
    }
}
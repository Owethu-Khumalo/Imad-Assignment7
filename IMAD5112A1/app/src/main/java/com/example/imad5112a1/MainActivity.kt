package com.example.imad5112a1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.MonthDay
import java.time.format.TextStyle

class MainActivity : AppCompatActivity() {

//Declaring variables
    private lateinit var edtTimeOfDay: EditText
    private lateinit var btnReset: Button
    private lateinit var tvResult: TextView









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //link the variables to the UI components using their ID's (typecasting)
        edtTimeOfDay = findViewById(R.id.edtTimeOfDay)
        btnReset = findViewById(R.id.btnReset)
        tvResult = findViewById(R.id.tvResults)

        //adding the button click listner
        btnReset.setOnClickListener {





        }







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
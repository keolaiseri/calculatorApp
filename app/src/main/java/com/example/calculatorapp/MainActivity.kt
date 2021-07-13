package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val tvInput = findViewById<TextView>(R.id.tvInput)
    val btnClear = findViewById<Button>(R.id.btnClear)
    var lastNumeric  : Boolean = false
    var lastDot : Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit (view: View){

        tvInput.append((view as Button).text)
        lastNumeric = true
    }

    fun onClear (view: View){
        tvInput.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onDecimalPoint (view: View){

        if(lastNumeric && !lastDot){
            tvInput.append(".")
            lastNumeric = false
            lastDot = true
        }

    }


}


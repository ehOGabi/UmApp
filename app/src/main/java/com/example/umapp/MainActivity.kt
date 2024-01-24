package com.example.umapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var campo1: EditText
    lateinit var button1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultado = findViewById<TextView>(R.id.txtResultado)
        campo1 = findViewById(R.id.txtiNome)
        button1 = findViewById(R.id.btn)
        button1.setOnClickListener {
            var campo1Formatado = campo1.text.toString()
            resultado.setText("May the force be with you ${campo1Formatado}!!")
        }
    }
}
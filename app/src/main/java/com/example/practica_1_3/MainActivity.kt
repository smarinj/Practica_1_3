package com.example.practica_1_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesConstantes()
    }

    private fun variablesConstantes() {

        //variables
        val miVariable = "Hola Clase de moviles"
        println(miVariable)

    }
}
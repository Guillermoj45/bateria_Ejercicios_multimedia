package com.example.ejercicio3

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercicio1.R

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttPrimer = findViewById<Button>(R.id.primerBoton)
        val buttSegundo = findViewById<Button>(R.id.segundoBoton)
        val buttTercer = findViewById<Button>(R.id.tercerBoton)
        val buttCuarto = findViewById<Button>(R.id.cuartoBoton)


        buttPrimer.setOnClickListener {
            val intent = Intent(this, PrimerLayout::class.java)
            startActivity(intent)
        }

        buttSegundo.setOnClickListener {
            val intent = Intent(this, SegundoLayout::class.java)
            startActivity(intent)
        }

        buttTercer.setOnClickListener {
            val intent = Intent(this, TercerLayout::class.java)
            startActivity(intent)
        }

        buttCuarto.setOnClickListener {
            val intent = Intent(this, CuartoLayout::class.java)
            startActivity(intent)
        }
    }
}
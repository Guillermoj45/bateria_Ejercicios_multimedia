package com.example.ejercicio2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercicio1.Ejercicio1
import com.example.ejercicio1.R
import java.lang.Thread.sleep

class Ejercicio2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botonVentana = findViewById<Button>(R.id.buttCambiarVentanaEjercicio2)
        botonVentana.setOnClickListener {
            sleep(2000)
            Intent(this, VentanaNuevaEjercicio2::class.java).also {
                startActivity(it)
            }
        }
    }
}
package com.example.ejercicio2

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
        val handler = Handler(Looper.getMainLooper())

        botonVentana.setOnClickListener {
            handler.postDelayed({
                val intent = Intent(this, VentanaNuevaEjercicio2::class.java)
                startActivity(intent)
            }, 10000)
            PendingIntent.getActivity(
                this,
                0,
                Intent(this, VentanaNuevaEjercicio2::class.java),
                PendingIntent.FLAG_UPDATE_CURRENT
            ).send()
        }
    }
}
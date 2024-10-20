package com.example.ejercicio1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercicio2.Ejercicio2
import com.example.ejercicio3.Ejercicio3
import com.example.ejercicio4.Ejercicio4
import com.example.ejercicio5.Ejercicio5
import com.example.ejercicio6.Ejercicio6

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ejercicio1 = findViewById<Button>(R.id.buttEjercicio1)
        val ejercicio2 = findViewById<Button>(R.id.buttEjercicio2)
        val ejercicio3 = findViewById<Button>(R.id.buttEjercicio3)
        val ejercicio4 = findViewById<Button>(R.id.buttEjercicio4)
        val ejercicio5 = findViewById<Button>(R.id.buttEjercicio5)
        val ejercicio6 = findViewById<Button>(R.id.buttEjercicio6)

        ejercicio1.setOnClickListener {
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }

        ejercicio2.setOnClickListener {
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }

        ejercicio3.setOnClickListener {
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }

        ejercicio4.setOnClickListener{
            val intent = Intent(this, Ejercicio4::class.java)
            startActivity(intent)
        }

        ejercicio5.setOnClickListener{
            val intent = Intent(this, Ejercicio5::class.java)
            startActivity(intent)

        }

        ejercicio6.setOnClickListener {
            val intent = Intent(this, Ejercicio6::class.java)
            startActivity(intent)
        }
    }
}
package com.example.ejercicio5

import android.R.bool
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.forEachIndexed
import com.example.ejercicio1.R

class Ejercicio5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var texto:TextView?=null
    private var numeroAntiguo:String = ""
    private var numeroNuevo:String = ""
    var operacion:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val columna1 = findViewById<TableRow>(R.id.columna1)
        val columna2 = findViewById<TableRow>(R.id.columna2)
        val columna3 = findViewById<TableRow>(R.id.columna3)
        val columna4 = findViewById<TableRow>(R.id.columna4)
        var operadores = findViewById<TableRow>(R.id.operaciones)
        val columnas: Array<TableRow> = arrayOf(columna1, columna2, columna3, columna4, operadores)
        texto = findViewById(R.id.Texto)

        for (columna in columnas){
            columna.forEachIndexed{index,e -> e.setOnClickListener{pulsado(e as Button)}}
        }
    }

    @SuppressLint("SetTextI18n")
    fun pulsado(butt: Button){
        butt.text.toString()
        when (butt.text.toString()){
            "+", "-", "*", "/" -> {
                if (!operacion.isEmpty()){
                    cuentas()
                }
                operacion = butt.text.toString()
                texto!!.text = numeroAntiguo + operacion
            }
            "=" -> {
                cuentas()
            }
            "C" -> {
                operacion = ""
                texto!!.text = ""
                numeroNuevo = ""
                numeroAntiguo = ""
            }
            else -> {

                if (operacion.isEmpty())
                    numeroAntiguo += butt.text.toString()
                else {
                    numeroNuevo += butt.text.toString()
                }
                texto!!.text = numeroAntiguo + operacion + numeroNuevo
            }

        }
    }
    fun cuentas(){
        if (operacion.isBlank()){
            texto!!.text = "No se a podido realizar la cuenta"
        } else if (operacion == "+") {
            val numero = numeroAntiguo.toFloat() + numeroNuevo.toFloat()
            texto!!.text = numero.toString()
            println(numero)
        } else if (operacion == "-") {
            val numero = numeroAntiguo.toFloat() - numeroNuevo.toFloat()
            texto!!.text = numero.toString()
        }
        else if (operacion == "*") {
            val numero = numeroAntiguo.toFloat() * numeroNuevo.toFloat()
            texto!!.text = numero.toString()
        }
        else if (operacion == "/") {
            val numero = numeroAntiguo.toFloat() / numeroNuevo.toFloat()
            texto!!.text = numero.toString()
        }
        numeroNuevo = ""
        numeroAntiguo = texto!!.text.toString()
    }
}
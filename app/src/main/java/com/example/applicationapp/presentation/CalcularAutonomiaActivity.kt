package com.example.applicationapp.presentation

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.applicationapp.R

class CalcularAutonomiaActivity : AppCompatActivity() {

    lateinit var btnback: ImageView
    lateinit var preco: EditText
    lateinit var km: EditText
    lateinit var btnCalcular: Button

    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autonomia_calcular)
        setupView()
        setupListeners()
    }

    fun setupView() {
        btnback = findViewById(R.id.iv_back)
        preco = findViewById(R.id.et_preco_kwh)
        km = findViewById(R.id.et_km_percorrido)
        btnCalcular = findViewById(R.id.btn_calcular)
        resultado = findViewById(R.id.tv_resultado)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }

        btnback.setOnClickListener {
            finish()
        }
    }

    fun calcular() {
        val result = preco.toString().toFloat() / km.toString().toFloat()
        resultado.text = result.toString()
    }
}
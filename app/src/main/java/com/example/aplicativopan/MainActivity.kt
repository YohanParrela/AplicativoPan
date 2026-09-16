package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)


        val meuBotao = findViewById<Button>(R.id.btnProxima)
        meuBotao.text = "Novo texto"

        meuBotao.setOnClickListener {
            meuBotao.text = texto.text
        }


    }
}
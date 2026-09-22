package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)

        val notap1 = findViewById<EditText>(R.id.edtNota1)
        val notap2 = findViewById<EditText>(R.id.edtNota2)
        val resultado = findViewById<TextView>(R.id.resultado)
        val botao = findViewById<Button>(R.id.btnCalcular)
        val peso = findViewById<EditText>(R.id.edtPeso)
        val altura = findViewById<EditText>(R.id.edtAltura)
        val resultadoIMC = findViewById<TextView>(R.id.resultadoIMC)
        val botaoIMC = findViewById<Button>(R.id.btnCalcularIMC)
        val indice = findViewById<TextView>(R.id.indice)

        botao.setOnClickListener {
            resultado.text = "Média é " + ((notap1.text.toString().toFloat() + notap2.text.toString().toFloat())/2).toString()
        }

        botaoIMC.setOnClickListener {

            val imcCalculado = peso.text.toString().toFloat() / (altura.text.toString().toFloat() * altura.text.toString().toFloat() / 10000)

            resultadoIMC.text = "Seu imc é " + imcCalculado.toString()


            if (imcCalculado < 18.5){
                indice.text = "Abaixo do peso"
            } else if (imcCalculado < 25){
                indice.text = "Normal"
            } else if (imcCalculado < 30){
                indice.text = "SobrePeso"
            } else if (imcCalculado < 35){
                indice.text = "Grau 1"
            } else if (imcCalculado < 40){
                indice.text = "Grau 2"
            } else {
                indice.text = "grau 3"
            }
        }
    }
}

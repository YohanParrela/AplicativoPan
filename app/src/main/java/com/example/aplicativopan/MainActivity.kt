package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
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
        */
        setContentView(R.layout.exercicionota)
        val etEx1 = findViewById<EditText>(R.id.etEx1)
        val btnEx1 = findViewById<Button>(R.id.btnEx1)
        val tvResultado1 = findViewById<TextView>(R.id.tvResultado1)

        btnEx1.setOnClickListener {
            val dobro = etEx1.text.toString().toInt() * 2
            tvResultado1.text = "O dobro é " + dobro.toString()
        }


        val etEx2 = findViewById<EditText>(R.id.etEx2)
        val btnEx2 = findViewById<Button>(R.id.btnEx2)
        val tvResultado2 = findViewById<TextView>(R.id.tvResultado2)

        btnEx2.setOnClickListener {
            val dias = etEx2.text.toString().toInt() * 365
            tvResultado2.text = "Você já viveu " + dias.toString() + " dias"
        }


        val etEx3 = findViewById<EditText>(R.id.etEx3)
        val btnEx3 = findViewById<Button>(R.id.btnEx3)
        val tvResultado3 = findViewById<TextView>(R.id.tvResultado3)

        btnEx3.setOnClickListener {
            val gorjeta = etEx3.text.toString().toDouble() * 0.10
            tvResultado3.text = "Gorjeta: R$ " + gorjeta.toString()
        }


        val etEx4 = findViewById<EditText>(R.id.etEx4)
        val btnEx4 = findViewById<Button>(R.id.btnEx4)
        val tvResultado4 = findViewById<TextView>(R.id.tvResultado4)

        btnEx4.setOnClickListener {
            val real = etEx4.text.toString().toDouble() * 5.0
            tvResultado4.text = "R$ " + real.toString()
        }
    }
}





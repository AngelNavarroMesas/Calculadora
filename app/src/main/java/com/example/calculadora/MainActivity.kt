package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import com.example.calculadora.databinding.ActivityMainBinding
import com.example.calculadora.databinding.CalculadoraBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val main = ActivityMainBinding.inflate(layoutInflater)
        val calculadora = CalculadoraBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.login.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                setContentView(calculadora.root)
            }
        })

        calculadora.atras.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                setContentView(main.root)
            }
        })

        calculadora.botonSumar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                calculadora.numResultado.text = calculadora.numero2.text
            }
        })

    }
}
package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculadora.databinding.ActivityMainBinding
import com.example.calculadora.databinding.CalculadoraBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val main = ActivityMainBinding.inflate(layoutInflater)
        val calculadora = CalculadoraBinding.inflate(layoutInflater)
        setContentView(main.root)

        var usuario: String = "admin"
        var contraseña: String = "admin"

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

        var result: Double = 0.0

        calculadora.botonSumar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                result = calculadora.numero1.text.toString().toDouble() + calculadora.numero2.text.toString().toDouble()
                calculadora.numResultado.text = result.toString()
            }
        })
        calculadora.botonRestar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                result = calculadora.numero1.text.toString().toDouble() - calculadora.numero2.text.toString().toDouble()
                calculadora.numResultado.text = result.toString()
            }
        })
        calculadora.botonMultiplicar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                result = calculadora.numero1.text.toString().toDouble() * calculadora.numero2.text.toString().toDouble()
                calculadora.numResultado.text = result.toString()
            }
        })
        calculadora.botonDividir.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var num1:Double = calculadora.numero1.text.toString().toDouble()
                var num2:Double = calculadora.numero2.text.toString().toDouble()

                if (num2!=0.0) {
                    result = num1/num2
                    calculadora.numResultado.text = result.toString()
                }
            }
        })

    }



}
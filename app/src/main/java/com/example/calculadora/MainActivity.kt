package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding
import com.example.calculadora.databinding.CalculadoraBinding

class MainActivity : AppCompatActivity() {
    var num1: Double = 0.0
    var num2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val main = ActivityMainBinding.inflate(layoutInflater)
        val calculadora = CalculadoraBinding.inflate(layoutInflater)
        setContentView(main.root)

        val usuario: String = "admin"
        val contraseña: String = "admin"

        main.login.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if(main.user.text.toString()==usuario && main.pass.text.toString()==contraseña) {
                    setContentView(calculadora.root)
                }else{
                    val toast = Toast.makeText(
                        applicationContext,
                        "Contraseña o usuario incorrectos",
                        Toast.LENGTH_SHORT
                    ).show()
                }
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
                if(calculadora.numero1.text.toString().isEmpty()){
                    num1=0.0
                }else{
                    num1=calculadora.numero1.text.toString().toDouble()
                }
                if(calculadora.numero2.text.toString().isEmpty()){
                    num2=0.0
                }else{
                    num2=calculadora.numero2.text.toString().toDouble()
                }

                result = num1 + num2
                calculadora.numResultado.text = result.toString()
            }
        })

        calculadora.botonRestar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if(calculadora.numero1.text.toString().isEmpty()){
                    num1=0.0
                }else{
                    num1=calculadora.numero1.text.toString().toDouble()
                }
                if(calculadora.numero2.text.toString().isEmpty()){
                    num2=0.0
                }else{
                    num2=calculadora.numero2.text.toString().toDouble()
                }
                result = num1 - num2
                calculadora.numResultado.text = result.toString()
            }
        })

        calculadora.botonMultiplicar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if(calculadora.numero1.text.toString().isEmpty()){
                    num1=0.0
                }else{
                    num1=calculadora.numero1.text.toString().toDouble()
                }
                if(calculadora.numero2.text.toString().isEmpty()){
                    num2=0.0
                }else{
                    num2=calculadora.numero2.text.toString().toDouble()
                }
                result = num1 * num2
                calculadora.numResultado.text = result.toString()
            }
        })

        calculadora.botonDividir.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if(calculadora.numero1.text.toString().isEmpty()){
                    num1=0.0
                }else{
                    num1=calculadora.numero1.text.toString().toDouble()
                }
                if(calculadora.numero2.text.toString().isEmpty()){
                    num2=0.0
                }else{
                    num2=calculadora.numero2.text.toString().toDouble()
                }

                if (num2==0.0) {
                    val toast = Toast.makeText(
                        applicationContext,
                        "El 0 no se puede dividir",
                        Toast.LENGTH_SHORT
                    ).show()
                }else{
                    result = num1/num2
                    calculadora.numResultado.text = result.toString()
                }
            }
        })

    }

    //private fun noNulo1(): Double {
    //    val calculadora = CalculadoraBinding.inflate(layoutInflater)
    //    if(calculadora.numero1.text.toString()==null){
    //        num1=0.0
    //    }else{
    //        num1=calculadora.numero1.text.toString().toDouble()
    //    }
    //    return num1
    //}

    //private fun noNulo2(): Double {
    //    val calculadora = CalculadoraBinding.inflate(layoutInflater)
    //    if(calculadora.numero2.text.toString()==null){
    //        num2=0.0
    //    }else{
    //        num2=calculadora.numero2.text.toString().toDouble()
    //    }
    //    return num2
    //}

}
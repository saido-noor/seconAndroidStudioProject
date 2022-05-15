package com.example.myapplicationcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
    lateinit var etNumber:EditText
    lateinit var etNumber2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var etView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        etNumber = findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etView = findViewById(R.id.etView)
        btnAdd.setOnClickListener {
            val num1 = etNumber.text.toString()
            val num2 = etNumber2.text.toString()
            add(num1.toInt(), num2.toInt())

        }

        btnSubtract.setOnClickListener {
            val num1 = etNumber.text.toString()
            val num2 = etNumber2.text.toString()
            subtract(num1.toInt(), num2.toInt())
        }

        btnMultiply.setOnClickListener {
            val num1 = etNumber.text.toString()
            val num2 = etNumber2.text.toString()

            multiply(num1.toInt(), num2.toInt())

        }

        btnModulus.setOnClickListener {
            val num1 = etNumber.text.toString()
            val num2 = etNumber2.text.toString()

            modulus(num1.toInt(), num2.toInt())

        }

    }

    fun add(num1:Int, num2:Int){
        val num = num1+num2
        etView.text = num.toString()
    }

    fun subtract(num1:Int, num2:Int){
        val num = num1-num2
        etView.text = num.toString()
    }

    fun multiply(num1:Int, num2:Int){
        val num = num1*num2
        etView.text = num.toString()
    }

    fun modulus(num1:Int, num2:Int){
        val num = num1%num2
        etView.text = num.toString()
    }

}
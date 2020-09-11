package com.example.l4s_dentaku

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var firstNumber = 0
    var secondNumber = 0
    var totalNumber = 0
    var operator = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

        plusButton.isEnabled = false
        minusButton.isEnabled = false
        multiplyButton.isEnabled = false
        equalButton.isEnabled = false

        numberText.text = firstNumber.toString()

        button0.setOnClickListener {
            buttonClick(0)
        }
        button1.setOnClickListener {
            buttonClick(1)
        }
        button2.setOnClickListener {
            buttonClick(2)
        }
        button3.setOnClickListener {
            buttonClick(3)
        }
        button4.setOnClickListener {
            buttonClick(4)
        }
        button5.setOnClickListener {
            buttonClick(5)
        }
        button6.setOnClickListener {
            buttonClick(6)
        }
        button7.setOnClickListener {
            buttonClick(7)
        }
        button8.setOnClickListener {
            buttonClick(8)
        }
        button9.setOnClickListener {
            buttonClick(9)
        }
        plusButton.setOnClickListener {
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            operator = "plus"
            numberText.text = secondNumber.toString()
        }
        minusButton.setOnClickListener {
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            operator = "minus"
            numberText.text = secondNumber.toString()
        }
        multiplyButton.setOnClickListener {
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            operator = "multiply"
            numberText.text = secondNumber.toString()
        }

        equalButton.setOnClickListener {
            if (operator == "plus"){
                totalNumber = firstNumber + secondNumber
            }else if (operator == "minus"){
                totalNumber = firstNumber - secondNumber
            }else if (operator == "multiply"){
                totalNumber = firstNumber * secondNumber
            }
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            firstNumber = 0
            secondNumber = 0
            operator = "empty"
            numberText.text = totalNumber.toString()
        }
        clear.setOnClickListener {
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            firstNumber = 0
            secondNumber = 0
            operator = "empty"
            numberText.text = "0"
        }

    }

    fun buttonClick(num:Int){
        if (operator == "empty"){
            firstNumber = firstNumber * 10 + num
            numberText.text = firstNumber.toString()
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))

            plusButton.isEnabled = true
            minusButton.isEnabled = true
            multiplyButton.isEnabled = true
            equalButton.isEnabled = true
        }else{
            secondNumber = secondNumber * 10 + num
            numberText.text = secondNumber.toString()
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,0))
        }
    }
}
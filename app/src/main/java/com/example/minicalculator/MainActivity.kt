package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button12.setOnClickListener {
            var num1 = num11.text.toString()
            var num2 = num22.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2",Toast.LENGTH_SHORT).show()
            textView9.text = "+"
            textView10.text = (num1.toDouble() + num2.toDouble()).toString()
        }
        button11.setOnClickListener {
            var num1 = num11.text.toString()
            var num2 = num22.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2",Toast.LENGTH_SHORT).show()
            textView9.text = "-"
            textView10.text = (num1.toDouble() - num2.toDouble()).toString()
        }
        button10.setOnClickListener {
            var num1 = num11.text.toString()
            var num2 = num22.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2",Toast.LENGTH_SHORT).show()
            textView9.text = "*"
            textView10.text = (num1.toDouble() * num2.toDouble()).toString()
        }
        button9.setOnClickListener {
            var num1 = num11.text.toString()
            var num2 = num22.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2",Toast.LENGTH_SHORT).show()
            textView9.text = "/"
            textView10.text = (num1.toDouble() / num2.toDouble()).toString()

        }
        button8.setOnClickListener {
            var num1 = num11.text.toString()
            var num2 = num22.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2",Toast.LENGTH_SHORT).show()
            textView9.text = "%"
            textView10.text = (num1.toDouble() % num2.toDouble()).toString()
        }
        button8.setOnClickListener {
            var num1 = num11.text.toString()
            var num2 = num22.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2",Toast.LENGTH_SHORT).show()
            textView9.text = "%"
            textView10.text = (num1.toDouble() % num2.toDouble()).toString()
        }
        button7.setOnClickListener {
            num11.text.clear()
            num22.text.clear()
            textView9.text = ""
            textView10.text = ""
        }
    }
}
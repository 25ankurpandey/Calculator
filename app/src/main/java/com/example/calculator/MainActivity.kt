package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var response: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.button)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)
        val btn6: Button = findViewById(R.id.button6)
        val btn7: Button = findViewById(R.id.button7)
        val btn8: Button = findViewById(R.id.button8)
        val btn9: Button = findViewById(R.id.button9)
        val btn0: Button = findViewById(R.id.button13)
        val btn10: Button = findViewById(R.id.button10)
        val btn11: Button = findViewById(R.id.button11)
        val btn12: Button = findViewById(R.id.button12)
        val btn14: Button = findViewById(R.id.button14)
        val btn15: Button = findViewById(R.id.button15)
        response = findViewById(R.id.t1)

        btn0.setOnClickListener {
            response?.append(btn0.text)
        }
        btn1.setOnClickListener {
            response?.append(btn1.text)
        }
        btn2.setOnClickListener {
            response?.append(btn2.text)
        }
        btn3.setOnClickListener {
            response?.append(btn3.text)
        }
        btn4.setOnClickListener {
            response?.append(btn4.text)
        }
        btn5.setOnClickListener {
            response?.append(btn5.text)
        }
        btn6.setOnClickListener {
            response?.append(btn6.text)
        }
        btn7.setOnClickListener {
            response?.append(btn7.text)
        }
        btn8.setOnClickListener {
            response?.append(btn8.text)
        }
        btn9.setOnClickListener {
            response?.append(btn9.text)
        }
        btn10.setOnClickListener {
            response?.append(btn10.text)
        }
        btn11.setOnClickListener {
            response?.append(btn11.text)
        }
        btn12.setOnClickListener {
            response?.append(btn12.text)
        }
        btn14.setOnClickListener {
            response?.append(btn14.text)
        }
        btn15.setOnClickListener {
            response?.text = ""
        }
    }
}
package com.bishaljung.revisionall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SiActivity : AppCompatActivity() {
    private lateinit var Principle : EditText
    private lateinit var time: EditText
    private lateinit var rate:EditText
    private lateinit var find:Button
    private lateinit var res:EditText
    private lateinit var backtoCalculate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        ///refrence / binding

        Principle =  findViewById(R.id.etPrinciple)
        val etTime:EditText = findViewById(R.id.etTime)
        val etRate:EditText = findViewById(R.id.etRate)
        val btnFind:Button = findViewById(R.id.btnFind)
        val tvSi:TextView = findViewById(R.id.tvSI)
        backtoCalculate = findViewById(R.id.backCalculate)

        ///set a click listner on button

        btnFind.setOnClickListener{
            val  first : Int = Principle.text.toString().toInt()
            val second : Int = etTime.text.toString().toInt()
            val third : Int = etRate.text.toString().toInt()
            val result : Int = (first * second * third)/100

            Toast.makeText(this, "result is $result", Toast.LENGTH_SHORT).show()
            tvSi.text= result.toString()
        }
        backtoCalculate.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}













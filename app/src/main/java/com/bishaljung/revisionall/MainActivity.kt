package com.bishaljung.revisionall

import android.content.Intent
import android.media.MediaParser
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var firstNum: EditText
    private lateinit var secondNum: EditText
    private lateinit var Add:RadioButton
    private lateinit var Subtract:RadioButton
    private lateinit var Multiply:RadioButton
    private lateinit var Divide:RadioButton
    private lateinit var Calculate:Button
    private lateinit var movetoSI:Button
    private lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNum= findViewById(R.id.firstNum)
        secondNum=findViewById(R.id.secondNum)
        Add=findViewById(R.id.add)
        Subtract=findViewById(R.id.Subtract)
        Multiply=findViewById(R.id.Multiply)
        Divide=findViewById(R.id.Divide)
        Calculate=findViewById(R.id.calculateBtn)
        movetoSI=findViewById(R.id.siFinder)
        tvResult=findViewById(R.id.Result)


        //for validation
        Calculate.setOnClickListener{
            if(TextUtils.isEmpty(firstNum.text)){
                firstNum.error="Please Enter First Number"
                firstNum.requestFocus()
                return@setOnClickListener
            }
            else if(TextUtils.isEmpty(secondNum.text)){
                secondNum.error="Please Enter Second Number"
                secondNum.requestFocus()
                return@setOnClickListener
            }
            calculate()

        }
        movetoSI.setOnClickListener{
            val intent= Intent(this, SiActivity::class.java)
            startActivity(intent)
        }

    }

    private fun calculate(){
        val first = firstNum.text.toString().toFloat()
        val second = secondNum.text.toString().toFloat()
        var result= 0.0F

        when{
            Add.isChecked ->{
                result= first+second
                Toast.makeText(this, "The addition of $first and $second is $result", Toast.LENGTH_LONG).show()
            }
            Subtract.isChecked ->{
                result= first-second
                Toast.makeText(this, "The subtraction of $first and $second is $result", Toast.LENGTH_SHORT).show()
            }
            Multiply.isChecked ->{
                result= first*second
                Toast.makeText(this,"The multiplication of $first and $second is $result", Toast.LENGTH_SHORT).show()

            }
            Divide.isChecked->{
                result= first/second
                Toast.makeText(this,"The division of $first and $second is $result",Toast.LENGTH_SHORT).show()
            }
        }
        tvResult.text=result.toString()
    }
}





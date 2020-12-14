package com.bishaljung.revisionall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialg)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Alert")

            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){dialogInterface, which->
                Toast.makeText(applicationContext,"clicked yes", Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){ dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked cancel", Toast.LENGTH_LONG).show()

            }
            builder.setNegativeButton("No"){ialogInterface, which->
                Toast.makeText(applicationContext,"clicked No", Toast.LENGTH_LONG).show()
            }

            val alertDialg: AlertDialog = builder.create()
            alertDialg.setCancelable(false)
            alertDialg.show()
        }
    }

}
package com.bishaljung.revisionall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class Spinner : AppCompatActivity() {

    private val languages = arrayOf("Nepali","American","Indian","Russian")
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        spinner = findViewById(R.id.spinner)

        val adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1,languages

        )
        spinner.adapter = adapter

        spinner.onItemSelectedListener=
            object : AdapterView.OnItemSelectedListener{
                override  fun onItemSelected(
                    parent:AdapterView<*>?,
                    view: View?,
                    position:Int,
                    id:Long
                ){
                    val selectedItem= parent?.getItemAtPosition(position).toString()
                    Toast.makeText(
                        this@Spinner,"Selected Item : $selectedItem",Toast.LENGTH_LONG
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
    }
}
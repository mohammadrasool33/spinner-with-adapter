package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val spinnerList= listOf("first","second","third")
        val spinnerAdapter=ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,spinnerList)
        val spinner:Spinner=findViewById(R.id.spinner)
        spinner.adapter=spinnerAdapter;


        spinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,"you selected ${parent?.getItemAtPosition(position).toString()}",Toast.LENGTH_LONG).show();

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}
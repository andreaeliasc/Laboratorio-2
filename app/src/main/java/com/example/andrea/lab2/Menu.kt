package com.example.andrea.lab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.menu.*

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)


        val helados = listOf("Helado de Fresa", "Helado de Chocolate", "Helado Arcoiris", "Sundae","Banana Split", "Vaca Rosa")
        lv_helado.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, helados)

        lv_helado.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, helados[position], Toast.LENGTH_SHORT).show()
        }
    }
}

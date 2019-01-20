package com.example.andrea.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.menu.*

class Menu : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)




val helados = listOf("helado de fresa", "helado de vainilla", "helado de chocolate", "vaca rosa", "banana split")



        lv_helado.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, helados)





             lv_helado.setOnItemClickListener { parent, view, position, id ->


                Toast.makeText(this, "Se agrego " + helados[position], Toast.LENGTH_SHORT).show()

            }.toString()


            btnRegresar.setOnClickListener {
                val intent: Intent = Intent(this, Actividad1::class.java)
                startActivity(intent)
                finish()
            }
        fun add(element: String) {

        }


    }
}

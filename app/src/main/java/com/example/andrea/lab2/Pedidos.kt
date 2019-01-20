package com.example.andrea.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast

import kotlinx.android.synthetic.main.pedidos.*


class Pedidos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedidos)

        val helados = listOf("helado de fresa", "helado de vainilla", "helado de chocolate", "vaca rosa", "banana split")



        lv_pedido.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, helados)












        btnBack.setOnClickListener {
            val intent: Intent = Intent(this, Actividad1::class.java)
            startActivity(intent)
            finish()
    }

        btnPedir.setOnClickListener {
            Toast.makeText(this, "Pedido Exitoso", Toast.LENGTH_SHORT).show()

        }.toString()


        btnLimpiar.setOnClickListener {


        }

        btnPedir.setOnClickListener{
            Toast.makeText(this, "Pedido Exitoso", Toast.LENGTH_SHORT).show()

        }.toString()
        }


        }







package com.example.andrea.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actividad1.*

class Actividad1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad1)

        btnIr.setOnClickListener{

            val intent:Intent = Intent(this,Menu::class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{
            val intent:Intent = Intent(this, Pedidos::class.java)
            startActivity(intent)
            finish()


        }
    }
}

package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        val y2 = findViewById<EditText>(R.id.y2)
        val y1 = findViewById<EditText>(R.id.y1)
        val x2 = findViewById<EditText>(R.id.x2)
        val x1 = findViewById<EditText>(R.id.x1)
        val r1_recta = findViewById<EditText>(R.id.tv_resultado_recta)
        val btn_recta = findViewById<Button>(R.id.boton_recta)

        btn_recta.setOnClickListener {
            r1_recta.setText(
                ":" + (y2.text.toString().toInt() - y1.text.toString()
                    .toInt()) / (x2.text.toString().toInt() - x1.text.toString().toInt())

            )
        }
    }
}
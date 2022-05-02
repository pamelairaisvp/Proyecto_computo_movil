package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val n1_aceleracion= findViewById<EditText>(R.id.tvaceleracion_1)
        val n2_aceleracion= findViewById<EditText>(R.id.tvaceleracion_2)
        val r1_aceleracion= findViewById<EditText>(R.id.tvaceleracion_3)
        val btn_aceleracion= findViewById<Button>(R.id.boton_aceleracion)

        btn_aceleracion.setOnClickListener {
            r1_aceleracion.setText(
                ":" + (n1_aceleracion.text.toString().toInt()) / (n2_aceleracion.text.toString().toInt()
                        )
            )

    }
}
}
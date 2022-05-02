package com.example.prueba
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.ln1p
import kotlin.math.sqrt
class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val n1=findViewById<EditText>(R.id.valor_a)
        val n2=findViewById<EditText>(R.id.valor_b)
        val r1=findViewById<EditText>(R.id.resultado_pitagoras)
        val btn_pitagoras=findViewById<Button>(R.id.boton_pitagoras)

        btn_pitagoras.setOnClickListener{
            r1.setText(
                ":"+(n1.text.toString().toInt()*n2.text.toString().toInt())
            )
        }


    }

}



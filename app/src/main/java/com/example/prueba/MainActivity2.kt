package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2 : AppCompatActivity() {


    lateinit var option: Spinner
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        option = findViewById(R.id.spinner5) as Spinner
        result = findViewById(R.id.tv_resultado) as TextView

        var options = arrayOf("Pitagoras","Aceleracion","Pendiente de una recta")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                result.text= options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text= "Por favor seleccione una opcion"


            }

        }
    }

}
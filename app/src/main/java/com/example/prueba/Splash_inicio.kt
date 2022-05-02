package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class Splash_inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_inicio)

        thread {
            Thread.sleep(6000)
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}




package com.example.araba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // kayıt ol butonu kayit sayfasına gidiyor
        val button1 = findViewById<Button>(R.id.btnkayitol)

        button1.setOnClickListener {
            val button =Intent(this,kayit_ol::class.java)
            startActivity(button)
        }
        // Giriş yap butonu giriş sayfasına gidiyor
        val girisyapbutonu = findViewById<Button>(R.id.btngirisyap)
        girisyapbutonu.setOnClickListener {
            val girisbutonu = Intent(this,girisayfasi::class.java)
            startActivity(girisbutonu)
        }


    }
}
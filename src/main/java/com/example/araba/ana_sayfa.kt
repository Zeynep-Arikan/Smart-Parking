package com.example.araba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ana_sayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_sayfa)

        //arabam butonu araba özellikleri sayfasına gidiyor
        val arabambutonu = findViewById<Button>(R.id.btnarabam)
        arabambutonu.setOnClickListener {
            val arabambutonu = Intent(this,araba_ozellikleri::class.java)
            startActivity(arabambutonu)
        }
        //çıkış yap butonu main_activitye gidiyor
        val cikisbutonu = findViewById<Button>(R.id.btnanasayfacıkıs)
        cikisbutonu.setOnClickListener{
            val cikisbutonu = Intent(this,MainActivity::class.java)
            startActivity(cikisbutonu)
        }
        // iletişim butonu iletişim sayfasına gönderiyor
        val iletisimbtn = findViewById<Button>(R.id.btniletisim)
        iletisimbtn.setOnClickListener{
            val iletisimbtn = Intent(this,iletisim::class.java)
            startActivity(iletisimbtn)
        }
    }
}
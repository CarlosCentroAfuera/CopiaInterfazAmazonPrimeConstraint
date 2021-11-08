package com.carlostena.copiainterfazamazonprime

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var imageViewPueblo : ImageView
    lateinit var tvOriginals : TextView
    lateinit var tvSeguir : TextView
    lateinit var tvFavoritos : TextView
    lateinit var hsvOriginals : HorizontalScrollView
    lateinit var hsvSeguir : HorizontalScrollView
    lateinit var hsvFavoritos : HorizontalScrollView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)

        imageViewPueblo = findViewById(R.id.iw_pueblo)

        tvOriginals = findViewById(R.id.tv_origials)
        tvSeguir = findViewById(R.id.tv_seguir_viendo)
        tvFavoritos = findViewById(R.id.tv_favoritos)

        hsvOriginals = findViewById(R.id.hsv_originals)
        hsvSeguir = findViewById(R.id.hsv_seguir_viendo)
        hsvFavoritos = findViewById(R.id.hsv_favoritos)

        imageViewPueblo.setOnClickListener {
            saludaAAmazon()
        }

        hsvOriginals.visibility = View.GONE
        hsvSeguir.visibility = View.GONE
        hsvFavoritos.visibility = View.GONE

        tvOriginals.setOnClickListener {
            if(hsvOriginals.visibility == View.VISIBLE)
                hsvOriginals.visibility = View.GONE
            else
                hsvOriginals.visibility = View.VISIBLE
        }
        tvSeguir.setOnClickListener {
            if(hsvSeguir.visibility == View.VISIBLE)
                hsvSeguir.visibility = View.GONE
            else
                hsvSeguir.visibility = View.VISIBLE
        }
        tvFavoritos.setOnClickListener {
            if(hsvFavoritos.visibility == View.VISIBLE)
                hsvFavoritos.visibility = View.GONE
            else
                hsvFavoritos.visibility = View.VISIBLE
        }

    }

    fun saludaAAmazon(){
        Toast.makeText(this, "Hola Amazon!", Toast.LENGTH_LONG).show()
    }
}
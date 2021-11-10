package com.carlostena.copiainterfazamazonprime

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.carlostena.copiainterfazamazonprime.databinding.ActivityMainConstraintBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainConstraintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.iwPueblo.setOnClickListener {
            saludaAAmazon()
        }

        binding.hsvOriginals.visibility = View.GONE
        binding.hsvSeguirViendo.visibility = View.GONE
        binding.hsvFavoritos.visibility = View.GONE

        binding.tvOrigials.setOnClickListener {
            if(binding.hsvOriginals.visibility == View.VISIBLE)
                binding.hsvOriginals.visibility = View.GONE
            else
                binding.hsvOriginals.visibility = View.VISIBLE
        }
        binding.tvSeguirViendo.setOnClickListener {
            if(binding.hsvSeguirViendo.visibility == View.VISIBLE)
                binding.hsvSeguirViendo.visibility = View.GONE
            else
                binding.hsvSeguirViendo.visibility = View.VISIBLE
        }
        binding.tvFavoritos.setOnClickListener {
            if(binding.hsvFavoritos.visibility == View.VISIBLE)
                binding.hsvFavoritos.visibility = View.GONE
            else
                binding.hsvFavoritos.visibility = View.VISIBLE
        }

    }

    fun saludaAAmazon(){
        Toast.makeText(this, "Hola Amazon!" + binding.tvFavoritos.text, Toast.LENGTH_LONG).show()
    }
}
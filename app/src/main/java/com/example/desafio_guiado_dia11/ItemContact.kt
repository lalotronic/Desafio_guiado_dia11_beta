package com.example.desafio_guiado_dia11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewbinding.ViewBinding
import com.example.desafio_guiado_dia11.databinding.ItemContactBinding


class ItemContact : AppCompatActivity() {

    lateinit var binding: ItemContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)

    }
    fun getViewBinding(): ItemContactBinding = ItemContactBinding.inflate(layoutInflater)
}
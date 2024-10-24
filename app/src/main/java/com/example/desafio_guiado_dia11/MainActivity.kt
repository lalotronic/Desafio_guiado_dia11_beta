package com.example.desafio_guiado_dia11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.desafio_guiado_dia11.databinding.ActivityMainBinding
import com.google.android.material.progressindicator.BaseProgressIndicator
import java.net.BindException

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ContactAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)

//pruebas de git

        adapter = ContactAdapter(dummyData())
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = adapter
    }
    fun dummyData(): List<Contact> = listOf(
        Contact(
            id = 1,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 2,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 3,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
    )
    fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

}
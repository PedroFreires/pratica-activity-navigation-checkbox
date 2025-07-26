package com.example.treinaractivities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.treinaractivities.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //Botão de voltar toolbar
        setSupportActionBar(binding.toolbar2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //evento de clique checkbox
        setStatus()

        binding.checkBox.setOnCheckedChangeListener { _, _ ->
            setStatus()
        }
    }

    //Botão de voltar

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
    //evento de clique checkbox
    private fun setStatus() {
        binding.textStatus.text = if (binding.checkBox.isChecked)  {
            "Objetivo Concluido Com Sucesso!"
        } else {
            "Tente Clicar Na Caixa"
        }
    }
}
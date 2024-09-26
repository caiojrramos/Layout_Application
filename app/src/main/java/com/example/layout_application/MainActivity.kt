package com.example.layout_application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Valor total da conta
    // Nr de Pessoas
    // Porcentagem de Gorjeta
    // 10%, 15% e 20%
    // Calcular
    // Limpar

    //Programar as Views
    //Recuprar as Views do Layout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }
}
package com.example.calculadoraresistencias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.calculadoraresistencias.Items.menu2
import com.example.calculadoraresistencias.Items.textos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            textos()// muestra el titulo de la aplicacion
            menu2() // muestra las casillas para que el usuario ingrese los valores
        }
    }
}

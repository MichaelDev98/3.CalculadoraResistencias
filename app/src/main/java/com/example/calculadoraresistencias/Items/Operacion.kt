package com.example.calculadoraresistencias.Items

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun textos() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            text = "\nCALCULADORA DE RESISTENCIAS",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )
    }
}


val Brown = Color(0xFFA52A2A)
val Orange = Color(0xFFFFA500)
val Yellow = Color(0xFFFFFF00)
val Green = Color(0xFF008000)
val Blue = Color(0xFF0000FF)
val Violet = Color(0xFF8A2BE2)
val Gray = Color(0xFF808080)
val White = Color(0xFFFFFFFF)
val Gold = Color(0xFFFFD700)
val Silver = Color(0xFFC0C0C0)

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun menu2() {
    var context = LocalContext.current
    var banda1 by remember { mutableStateOf<String?>(null) }
    var banda2 by remember { mutableStateOf<String?>(null) }
    var banda3 by remember { mutableStateOf<String?>(null) }
    var banda4 by remember { mutableStateOf<String?>(null) }
    var isExpanded1 by remember { mutableStateOf(false) }
    var isExpanded2 by remember { mutableStateOf(false) }
    var isExpanded3 by remember { mutableStateOf(false) }
    var isExpanded4 by remember { mutableStateOf(false) }
    var resistencia by remember { mutableStateOf<String?>(null) }

    val colores = listOf(
        "Negro" to Black,
        "Marrón" to Brown,
        "Rojo" to Red,
        "Naranja" to Orange,
        "Amarillo" to Yellow,
        "Verde" to Green,
        "Azul" to Blue,
        "Violeta" to Violet,
        "Gris" to Gray,
        "Blanco" to White
    )

    val coloresTolerancia = listOf(
        "Dorado" to Gold,
        "Plateado" to Silver,
        "Marrón" to Brown
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Column {
            // Banda 1
            ExposedDropdownMenuBox(
                expanded = isExpanded1,
                onExpandedChange = { isExpanded1 = !isExpanded1 }
            ) {
                TextField(
                    value = banda1 ?: "Valor banda 1",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded1) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(),
                    modifier = Modifier.menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = isExpanded1,
                    onDismissRequest = { isExpanded1 = false }
                ) {
                    colores.forEach { (nombre, color) ->
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(color)
                                    )
                                    Text("  $nombre")
                                }
                            },
                            onClick = {
                                banda1 = nombre
                                isExpanded1 = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Banda 2
            ExposedDropdownMenuBox(
                expanded = isExpanded2,
                onExpandedChange = { isExpanded2 = !isExpanded2 }
            ) {
                TextField(
                    value = banda2 ?: "Valor banda 2",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded2) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(),
                    modifier = Modifier.menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = isExpanded2,
                    onDismissRequest = { isExpanded2 = false }
                ) {
                    colores.forEach { (nombre, color) ->
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(color)
                                    )
                                    Text("  $nombre")
                                }
                            },
                            onClick = {
                                banda2 = nombre
                                isExpanded2 = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Banda 3 (Multiplicador)
            ExposedDropdownMenuBox(
                expanded = isExpanded3,
                onExpandedChange = { isExpanded3 = !isExpanded3 }
            ) {
                TextField(
                    value = banda3 ?: "Multiplicador",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded3) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(),
                    modifier = Modifier.menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = isExpanded3,
                    onDismissRequest = { isExpanded3 = false }
                ) {
                    colores.forEach { (nombre, color) ->
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(color)
                                    )
                                    Text("  $nombre")
                                }
                            },
                            onClick = {
                                banda3 = nombre
                                isExpanded3 = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Banda 4 (Tolerancia)
            ExposedDropdownMenuBox(
                expanded = isExpanded4,
                onExpandedChange = { isExpanded4 = !isExpanded4 }
            ) {
                TextField(
                    value = banda4 ?: "Tolerancia",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded4) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(),
                    modifier = Modifier.menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = isExpanded4,
                    onDismissRequest = { isExpanded4 = false }
                ) {
                    coloresTolerancia.forEach { (nombre, color) ->
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(color)
                                    )
                                    Text("  $nombre")
                                }
                            },
                            onClick = {
                                banda4 = nombre
                                isExpanded4 = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botón para calcular la resistencia
            Button(onClick = {
                if (banda1 != null && banda2 != null && banda3 != null && banda4 != null) {
                    val valor1 = colores.indexOfFirst { it.first == banda1 } * 10
                    val valor2 = colores.indexOfFirst { it.first == banda2 }
                    val multiplicador = when (banda3) {
                        "Negro" -> 1
                        "Marrón" -> 10
                        "Rojo" -> 100
                        "Naranja" -> 1000
                        "Amarillo" -> 10000
                        "Verde" -> 100000
                        "Azul" -> 1000000
                        "Violeta" -> 10000000
                        "Gris" -> 100000000
                        "Blanco" -> 1000000000
                        else -> 1
                    }
                    val tolerancia = when (banda4) {
                        "Dorado" -> "±5%"
                        "Plateado" -> "±10%"
                        "Marrón" -> "±1%"
                        else -> ""
                    }
                    val valor = (valor1 + valor2) * multiplicador
                    resistencia = "$valor Ω $tolerancia"
                } else {
                    Toast.makeText(context, "Por favor, selecciona todas las bandas", Toast.LENGTH_SHORT).show()
                }
            }) {
                Text("Calcular Resistencia")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Mostrar el valor de la resistencia
            resistencia?.let {
                Text("Valor de la resistencia: $it")
            }
        }
    }
}
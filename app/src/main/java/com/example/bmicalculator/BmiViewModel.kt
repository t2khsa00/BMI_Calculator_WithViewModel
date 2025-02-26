package com.example.bmicalculator

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class BmiViewModel : ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    // Computed BMI value
    val bmi: String
        get() {
            val height = heightInput.toFloatOrNull() ?: 0.0f
            val weight = weightInput.toFloatOrNull() ?: 0.0f
            return if (height > 0 && weight > 0) "%.2f".format(weight / (height * height)) else "Invalid Input"
        }
}

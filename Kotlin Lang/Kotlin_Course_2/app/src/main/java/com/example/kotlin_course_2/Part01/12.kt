package com.example.kotlin_course_2.Part01

import androidx.compose.ui.unit.Dp

fun addNumbers(x: Double, y: Double) {
    val sum = x + y
    println("The sum of $x and $y is $sum")
}

fun main() {

    println("Main Function Started")
    addNumbers(3.0, 5.0)
    addNumbers(10.0, 20.0)
    addNumbers(100.0, 200.0)

}
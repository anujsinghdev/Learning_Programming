package com.example.kotlin_course_03.Part1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the first number:")
    val num1 = scanner.nextDouble()

    println("Enter the second number:")
    val num2 = scanner.nextDouble()

    val sum = num1 + num2

    println("The sum of $num1 and $num2 is $sum.")

    var isRaining = true

    if (isRaining) {
        println("Bring an umbrella.")
    } else {
        println("Do not bring an umbrella.")

    }
     println("Now you can go outside")

}
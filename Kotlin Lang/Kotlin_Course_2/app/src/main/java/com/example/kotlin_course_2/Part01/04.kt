package com.example.kotlin_course_2.Part01

//swap number

fun main() {
    var number1 = readln()
    var number2 = readln()

    println("Before swapping: number1 = $number1, number2 = $number2")

    val temp = number1
    number1 = number2
    number2 = temp

    println("After swapping: number1 = $number1, number2 = $number2")

}
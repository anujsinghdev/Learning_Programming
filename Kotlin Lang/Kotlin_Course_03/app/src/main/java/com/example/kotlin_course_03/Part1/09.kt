package com.example.kotlin_course_03.Part1

fun main() {

    val c = add3(10, 20)
    println(c)
}


fun add3(a : Int = 20, b : Int= 15) : Int {
    val sum = a + b
    return a + b
}
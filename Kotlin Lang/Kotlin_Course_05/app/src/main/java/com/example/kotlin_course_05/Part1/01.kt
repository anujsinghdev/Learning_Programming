package com.example.kotlin_course_05.Part1

fun main() {
    val a = 10
    val b = 45

    val max = if (a > b) a else b
    println("Max : $max")

    println("Enter day number")
    val day = readln().toInt()

    when(day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }


}
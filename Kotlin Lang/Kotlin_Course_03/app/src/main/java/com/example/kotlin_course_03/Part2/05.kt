package com.example.kotlin_course_03.Part2

fun main() {
    val marks = readln().toInt()

    if (marks >= 90) {
        println("Grade: A")
    } else if (marks >= 80) {
        println("Grade: B")
    } else if (marks >= 70) {
        println("Grade: C")
    } else if (marks >= 60) {
        println("Grade: D")
    } else {
        println("Grade: F")
    }

    val day = readln().toInt()

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")
    }

}
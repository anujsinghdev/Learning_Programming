package com.example.kotlin_course_03.Part1

import java.util.Scanner

fun main() {
    var day = Scanner(System.`in`).nextInt()

    val result = when (day) {
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
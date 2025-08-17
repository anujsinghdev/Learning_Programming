package com.example.kotlin_course_03.Part2

fun main() {
    var x = readln().toInt()

    if (x < 0) {
        println("x is negative")
    } else {
        println("x is positive")
    }

    val age = 18

    if (age >= 18) {
        println("You are eligible to vote")
    } else {
        println("You are not eligible to vote")
    }

    val num = 5

    if (num % 2 == 0) {
        println("$num is even")
    } else {
        println("$num is odd")
    }

    val a = 10
    val b = 20

    if (a > b) {
        println("$a is greater than $b")
    } else {
        println("$b is greater than $a")
    }


}
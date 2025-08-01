package com.example.kotlin_course_2.Part01

fun main() {

    println(1<2)
    println(1>2)
    println(1==2)
    println(1!=2)

    println("Enter your age ")
    val age = readln().toInt()

    if (age > 60) {
        println("Your are senior citizen")
    }
}
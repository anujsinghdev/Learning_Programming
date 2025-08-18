package com.example.kotlin_course_05

fun main() {
    for (j in 1..10){
        for (i in 1..10){
            print("${i * j}\t")
        }
        println()
    }

    val fruits = listOf("Apple", "Banana", "Orange", "Mango")
    for (fruit in fruits){
        println(fruit)
    }

    var i = 1

    while (i <= 10){
        println(i)
        i++
    }
}
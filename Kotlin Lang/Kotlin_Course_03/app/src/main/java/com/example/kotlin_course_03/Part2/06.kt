package com.example.kotlin_course_03.Part2

fun main() {
    for (j in 1..10){
        println(j)
    }

    val fruits = listOf("Apple", "Banana", "Orange")
    for (fruit in fruits) {
        println(fruit)
    }

    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

    val map = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    for ((key, value) in map) {
        println("$key -> $value")
    }



}
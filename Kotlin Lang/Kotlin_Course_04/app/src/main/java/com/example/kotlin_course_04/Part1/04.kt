package com.example.kotlin_course_04.Part1

fun main() {
    var name = readln()
    println("Hello $name")

    val fruits = mutableListOf("Apple", "Banana", "Orange")
    fruits.add("Mango")
    fruits.remove("Banana")

    println(fruits)
    println(fruits.size)
    println(fruits.contains("Apple"))

    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)


    val map = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    println(map)

    map["Four"] = 4
    println(map)



}
package com.example.kotlin_course_04.Part1

fun main() {
    val numbers : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    val mixedArray = arrayOf(1,2,3,4,5,6,7,8,9,"Hello","World")

    println("First element of numbers array: ${numbers[0]}")
    println("First element of mixedArray array: ${mixedArray[9]}")

    var name1: String? = null
    println("Name : $name1")

    name1 = "Shivamshekhar"
    println("Updated Name : $name1")


}
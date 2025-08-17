package com.example.kotlin_course_03.Part2

fun main() {
    var i = 1

    while (i <= 10) {
        println("Current value of i is $i")
        i++
    }

    var name: String? = null
    val length = name?.length ?: 5
    println("Length of name is $length")

}
package com.example.kotlin_course_05.Part2

fun main() {
    val max = getMax(5,4)
    println(max)
}

fun getMax(a:Int, b:Int): Int {
    val max = if (a > b) a else b
        return max
    println("Some text")
}
package com.example.kotlin_course_2.Part01

fun main() {

    val isMarried = false
    val GPA = 3.6
    val isQualified = if (isMarried && GPA >= 3.5) true else false

    println(isQualified)
}
package com.example.kotlin_course_2.Part01
import java.util.*

fun main() {

    println("Enter Year of Birth : ")
    val yearOfBirth = readln()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    val age = currentYear - yearOfBirth.toInt()

    println("Your age is $age")
}
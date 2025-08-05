package com.example.kotlin_course_2.Part01

import java.util.Locale

fun main() {

    var message = "Welcome to new York ?"
    var name = "John"
    val age = 25

    val alldata = "$message $name $age"

    println(alldata)
    println(alldata.toUpperCase(Locale.ROOT))
}
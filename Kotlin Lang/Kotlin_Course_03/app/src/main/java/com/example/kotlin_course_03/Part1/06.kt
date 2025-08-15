package com.example.kotlin_course_03.Part1

fun main() {

    var name : String ? = null

    println(name?.length)

    name?.let { myName ->

        println(myName.length)

    }

    println(add(10, 20))






}
// Functions in Kotlin
fun add(a : Int, b : Int) : Int {
    return a + b
}
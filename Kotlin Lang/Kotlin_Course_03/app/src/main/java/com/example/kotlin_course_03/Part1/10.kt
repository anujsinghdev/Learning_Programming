package com.example.kotlin_course_03.Part1

fun main() {

    val data = arrayOf(1, 2, 3, 4, 5)
    println(data.get(4))

    val names = arrayOf("John", "Jane", "Bob", "Alice", 1,2,3)
    println(names[2])
    names.forEachIndexed { index, element ->
     println("$index : $element")
    }
    println(names.size)
    println(data.contentToString())
    names.set(2,"Anuj")
    println(names.reversed())
}
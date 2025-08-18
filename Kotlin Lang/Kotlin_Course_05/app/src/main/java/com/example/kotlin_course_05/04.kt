package com.example.kotlin_course_05

fun main() {
    val obj: Any = "Hello"
    val str: String? = obj as? String
    println(str)

    val obj1: Any = 123
    val str1: String? = obj1 as? String
    println(str1)



}

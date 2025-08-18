package com.example.kotlin_course_05

fun main() {
    // null safety in kotlin

    var name: String? = null
    name = "anujs"
    println(name?.length)

    val name1: String? = "anuj"
    println(name1!!.length)

    val name2: String? = null
    println(name2 ?: "default")

    val name3: String? = "anuj"
    println(name3 ?: "default")

    val name4: String? = null
    name4?.let {
        println(it.length)
    }

    val name5: String? = "anuj"
    name5?.let {
        println(it.length)
    }

    val name6: String? = null
    name6?.let {
        println(it.length)
    }


    
}
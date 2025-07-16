package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {
    val obj = userDetails("Anuj", 21)

}

class userDetails(name: String, age: Int) {
    init {
        println("My name is $name and my age is $age")
    }
}
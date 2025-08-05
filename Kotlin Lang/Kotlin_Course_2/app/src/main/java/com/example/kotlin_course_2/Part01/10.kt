package com.example.kotlin_course_2.Part01

fun main() {

    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()

    }

    for (i in 1..10 step 1) {
        for (j in 1..i) {
            print(j)
        }
        println()

    }

}
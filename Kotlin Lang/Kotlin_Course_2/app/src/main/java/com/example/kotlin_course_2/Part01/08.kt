package com.example.kotlin_course_2.Part01

fun main() {

    println("What is your favorite food?")
    println("1. Pizza")
    println("2. Burger")
    println("3. Fries")
    println("4. Soda")
    val foodID = readln().toInt()

    when(foodID){
        1 -> {
            println("Pizza")
        }
        2 -> {
            println("Burger")
        }
        3 -> {
            println("Fries")
        }
        4 -> {
            println("Soda")

        }
        else -> {
            println("Invalid choice")
        }
    }
}
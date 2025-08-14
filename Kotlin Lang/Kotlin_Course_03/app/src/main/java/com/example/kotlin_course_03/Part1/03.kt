package com.example.kotlin_course_03.Part1

fun main() {

    val scanner = java.util.Scanner(System.`in`)

    println("Enter Marks for Subject 1 : ")
    val marks1 = scanner.nextDouble()

    println("Enter Marks for Subject 2 : ")
    val marks2 = scanner.nextDouble()

    println("Enter Marks for Subject 3 : ")
    val marks3 = scanner.nextDouble()

    println("Enter Marks for Subject 4 : ")
    val marks4 = scanner.nextDouble()

    println("Enter Marks for Subject 5 : ")
    val marks5 = scanner.nextDouble()

    if (marks1 < 33 || marks2 < 33 || marks3 < 33 || marks4 < 33 || marks5 < 33) {
        println("You have failed")
    } else {
        println("You have passed")
    }

}
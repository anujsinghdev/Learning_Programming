package com.example.kotlin_course_03.Part2

fun main() {
    var name = readln()
    println("Hello $name")

    val fruits = mutableListOf("Apple", "Banana", "Orange")
    fruits.add("Mango")
    println(fruits)
    println(fruits[2])
    println(fruits.size)

    val a = 45
    val b = 55

    println("Addition of $a and $b is ${a+b}")
    println("Subtraction of $a and $b is ${a-b}")
    println("Multiplication of $a and $b is ${a*b}")
    println("Division of $a and $b is ${a/b}")
    println("Modulus of $a and $b is ${a%b}")

    // Logical Operators

    if (a > b && a > 10) {
        println("$a is greater than $b and greater than 10")
    } else if (a < b || a < 10) {
        println("$a is less than $b or less than 10")
    } else {
        println("$a is equal to $b")
    }





}
package com.example.kotlin_course_04.Part1

fun main() {
    var a = readln()
    var b = readln()

    if (a == "anuj" && b == "rishabh") {
        println("Login Successful")
    } else {
        println("Login Failed")
    }

    if (a == "anuj" || b == "rishabh") {
        println("Login Successful")
    } else {
        println("Login Failed")
    }

    val x = 5
    val y = 10

    println(x == y)
    println(x != y)
    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)

    var num = 11

    num += 5
    println(num)

    num -= 4
    println(num)

    num *= 3
    println(num)

    num /= 2
    println(num)

    num %= 2
    println(num)

    num++
    println(num)

    num--
    println(num)




}
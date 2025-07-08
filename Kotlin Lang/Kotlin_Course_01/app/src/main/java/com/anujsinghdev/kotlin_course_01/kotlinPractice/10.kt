package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    var a = 101
    var b = 5

    println("Addition is ${a+b}")
    println("Subtraction is ${a-b}")
    println("Multiplication is ${a*b}")
    println("Division is ${a/b}")
    println("Modulus is ${a%b}")

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))

    var data = 10
    var convert = data.toString()
    println(convert)

    var data1 = intArrayOf(12,32,43,22,54,78)
    println(data1.sum())

    if (a>b) {
        println("a is greater than b")
    } else {
        println("b is greater than a")
    }

}
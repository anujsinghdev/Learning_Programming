package com.example.kotlin_course_05

class Calculator{
    fun add(a: Int, b: Int): Int{
        return a + b
    }
    fun add(a: Int, b: Int, c: Int): Int{
        return a + b + c
    }
    fun add(a: Double, b: Double): Double{
        return a + b
    }
}

fun main() {
    val calc = Calculator()
    println(calc.add(10, 20))
    println(calc.add(10, 20, 30))
    println(calc.add(10.5, 20.5))

}
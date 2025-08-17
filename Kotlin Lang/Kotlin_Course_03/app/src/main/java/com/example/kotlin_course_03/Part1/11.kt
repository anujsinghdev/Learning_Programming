package com.example.kotlin_course_03.Part1

fun main() {
    val obj = Calculator()
    println(obj.add(10, 20))
    println(obj.sub(10, 20))
    println(obj.mul(10, 20))
    println(obj.div(10, 20))

    val obj1 = Calc(10, 20)
    println(obj1.add())
    println(obj1.sub())
    println(obj1.mul())
    println(obj1.div())


}

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun sub(a: Int, b: Int): Int {
        return a - b
    }
    fun mul(a: Int, b: Int): Int {
        return a * b
    }
    fun div(a: Int, b: Int): Int {
        return a / b
    }
}

class Calc(val a : Int, val b : Int) {
    fun add() = a + b
    fun sub() = a - b
    fun mul() = a * b
    fun div() = a / b
}

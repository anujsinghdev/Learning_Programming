package com.example.kotlin_course_05.Part1

open class ProtectedExample {
    protected val protectedData = "I am protected"

    protected fun showData() {
        println("I am protected")
    }
}

class Child : ProtectedExample() {
    fun accessProtectedData() {
        println(protectedData)
        showData()
    }
}

fun main() {
    val obj = Child()
    obj.accessProtectedData()
 //   println(obj.protectedData)
}
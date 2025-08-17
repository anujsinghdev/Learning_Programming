package com.example.kotlin_course_03.Part1

fun main() {

}
abstract class AbsExp{
    abstract fun greet()
}

interface MyInterface{
    fun greet()
}

class AbsExpImpl : AbsExp(){
    override fun greet() {
        println("Hello from AbsExpImpl")
    }
}
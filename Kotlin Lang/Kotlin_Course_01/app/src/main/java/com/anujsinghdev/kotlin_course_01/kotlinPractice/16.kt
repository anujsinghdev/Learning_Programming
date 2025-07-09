package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    val result = numberOfArguments(12,32,1,45,67,87,89,98)
    println(result)

    fun display()
    {
        println("Local function.. ")
    }

    display()
    display1()
    val res = sum1(15)
    println(res)

}

fun numberOfArguments(vararg data:Int): Int = data.sum()

fun display1() = println("Single line function ")

fun sum1(a:Int,b:Int=12):Int = a+b
package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {
    val data = {x:Int,y:Int->x+y}
    val res = sum(12,32,data)
    println("Result is $res")
}

fun sum(x:Int,y:Int,add:(Int,Int)->Int):Int = add(x,y)
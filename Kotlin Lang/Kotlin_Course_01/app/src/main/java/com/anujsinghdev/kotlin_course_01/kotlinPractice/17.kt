package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    val data = fun(x:Int)
    {
        println(x)
    }
    data(16)

    val data1 = {x: Int,y: Int->x+y}
    println(data1(12,45))

    val data2:(Int,Int)-> Int = { x,y->x+y}
    println(data2(12,4))

}
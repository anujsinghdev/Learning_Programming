package com.example.kotlin_course_03.Part1

import androidx.compose.ui.graphics.vector.addPathNodes

fun main() {
    add1()
    add2(110, 20)
}

fun add1(){
    val a = 10
    val b = 20
    val sum = a + b
    println("The sum of $a and $b is $sum")

}

fun add2(a : Int, b : Int){
    val sum = a + b
    println("The sum of $a and $b is $sum")
}
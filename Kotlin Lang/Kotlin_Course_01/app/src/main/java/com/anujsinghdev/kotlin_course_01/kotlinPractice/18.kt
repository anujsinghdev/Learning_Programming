package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {
    // higher order function
    display { println("Hello World") }


}

fun display(disp:()-> Unit) = disp()
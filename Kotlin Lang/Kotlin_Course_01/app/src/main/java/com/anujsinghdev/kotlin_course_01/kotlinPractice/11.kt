package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    var a = 14
    var b = 11

    var max = if (a<b) {
        println("a is greater than b")
        a
    } else {
        println("b is greater than a")
        b
    }

    println(max)

    var c = 12
    println(c.inc())

    var d = 12
    println(d.dec())



}
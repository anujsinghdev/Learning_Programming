package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    val data = arrayOf(12,34,54,67,89,99,55)
    val iterator = data.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }

    val data1 = arrayOf(12,34,54,67,89,99,55)
    data1.forEach {
        println(it)
    }

    for (i in 1..10){
        if (i==5)
            break
        println(i)
    }

    for (i in 1..10){
        if (i==5)
            continue
        println(i)
    }

    // Nested loop in kotlin

    for (i in 1..5) {
        for (j in 1..5) {
            println("i = $i and j = $j")
        }
    }

    // break label in kotlin

    outerloop@ for (i in 1..5) {

        for (j in 1..5) {
            if (j==3)
                break@outerloop
            println(j)
        }
    }

    // continue label in kotlin

    outerloop@ for (i in 1..5) {
        println("Outer loop $i")
        for (j in 1..5) {
            if (j==3)
                continue@outerloop
            println(j)
        }
    }



}
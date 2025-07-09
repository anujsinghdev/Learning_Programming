package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    arrayOf(1,2,3,4,5,6,7,)

        .forEach{
            if (it == 3)
                return@forEach
            println(it)
        }


    arrayOf(1,2,3,4,5).forEach { _ ->
        fun(it:Int){
            println(it)
        }
    }

    for (i in 1 until 5){
        println(i)
    }

    when(1){
        1 -> println("This is one")
        2 -> println("This is two")
        else -> println("Invalid")
    }

    val result = when(2){
        in 1..5 -> "i am in range 1 to 5 "
        6-> "i am two "
        else -> "invalid"
    }
    println(result)

    val result1 = when(4){
        1,2,3,4-> "one to four"
        else -> "invalied"
    }
    println(result1)

    val result2 = when(4){
        in 1 until 4-> "one until 4"
        else -> "invalied"
    }
    println(result2)



}
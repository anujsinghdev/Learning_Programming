package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    val result = when(4){
        !in 1..4-> { "hello 1 to 4"
                        "hello how are you"}
        else -> "invalied"
    }
    println(result)

    anuj()
    number(12)
    println(name())
    val add = sum(12,4)
    println(add)


}

fun anuj(){
    println("takes nothing returns nothing")
}

fun sum(x: Int,y:Int): Int = x+y

fun number(x: Int){
    println(x)
}

fun name(): String
{
    return "My name is anuj "
}
package com.example.kotlin_course_05.Part1

fun main() {
    println(square(7))
    printData(10)
    printData("Shivam")
    printData(10.5)

}

fun square(n: Int) = n*n

fun <T> printData(data: T){
    println("Data: $data")
}


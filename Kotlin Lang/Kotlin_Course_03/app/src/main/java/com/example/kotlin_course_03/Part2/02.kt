package com.example.kotlin_course_03.Part2

import android.graphics.Path


fun main() {
    // Numeric data types

    val byteVal : Byte = 127
    val shortVal : Short = 32767
    val intVal : Int = 2147483647
    val longVal : Long = 9223372036854775807

    println("Byte value: $byteVal")
    println("Short value: $shortVal")
    println("Int value: $intVal")
    println("Long value: $longVal")

    // Floating-point data types

    val floatVal : Float = 3.14f
    val doubleVal : Double = 3.141592653589793

    println("Float value: $floatVal")
    println("Double value: $doubleVal")

    // Character and string data types
    val charVal : Char = 'A'
    val stringVal : String = "Hello, World!"

    println("Char value: $charVal")
    println("String value: $stringVal")

    // Boolean data type
    val booleanVal : Boolean = true

    println("Boolean value: $booleanVal")


    // Array data type
    val arrayVal : Array<Int> = arrayOf(1, 2, 3, 4, 5)

    println("Array value: ${arrayVal.contentToString()}")



}
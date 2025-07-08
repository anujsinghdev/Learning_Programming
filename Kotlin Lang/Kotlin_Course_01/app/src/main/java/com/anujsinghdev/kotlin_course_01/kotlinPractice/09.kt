package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    // small data type to large type possible
    // large data type to small type not possible

    var data = "122"

    var convert : Int = data.toInt()

    println(convert)

    var data1 = "12254"
    var convert1 : Long = data1.toLong()
    println(convert1)

    var data2 = "12254"
    var convert2 : Short = data2.toShort()
    println(convert2)

    var data3 = "12254"
    var convert3 : Float = data3.toFloat()
    println(convert3)

    var data4 = "122.54"
    var convert4 : Double = data4.toDouble()
    println(convert4)

    var data5 = "true"
    var convert5 : Boolean = data5.toBoolean()
    println(convert5)

    var data6 = "A"
    var convert6 : Byte = data6.toByte()
    println(convert6)

    var data7 = "1"
    var convert7 : UInt = data7.toUInt()
    println(convert7)

    var data8 = "11"
    var convert8 : UShort = data8.toUShort()
    println(convert8)

    var data9 = "111234"
    var convert9 : ULong = data9.toULong()
    println(convert9)

    var data10 = "1234"
    var convert10 : UByte = data10.toUByte()
    println(convert10)





}
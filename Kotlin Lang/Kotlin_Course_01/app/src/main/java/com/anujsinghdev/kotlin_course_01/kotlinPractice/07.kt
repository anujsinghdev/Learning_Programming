package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    var data = arrayOf(1,2,3,4,5,6,7,8,9)
    data[1] = 5
    println(data[1])

    var data1 = arrayOfNulls<Int>(10)
    data1[0] = 11
    data1[1] = 10
    println(data1[0])

    var data2 = arrayOf(12,34,5,6,77,88)
    println(data2[0])
    data2 = emptyArray()
    println(data2)

    var data3 : UInt = 12U
    println(data3)

    var data4 : UByte = 122U
    println(data4)

    var data5 : UShort = 1234U
    println(data5)

    var data6 : ULong = 123456789U
    println(data6)

    var data7 = ubyteArrayOf(12u,13u,33u,21u)
    println(data7[1])

    var data8 = ushortArrayOf(12u,13u,33u,21u)
    println(data8[1])

    var data9 = uintArrayOf(12u,13u,33u,21u)
    println(data9[1])

    var data10 = ulongArrayOf(12u,13u,33u,21u)
    println(data10[1])




}
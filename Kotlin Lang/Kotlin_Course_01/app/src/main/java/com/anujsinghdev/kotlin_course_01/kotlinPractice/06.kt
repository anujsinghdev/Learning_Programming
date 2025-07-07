package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    var name : String = "Anuj Singh"
    println(name)

    var data1 : Boolean = false
    println(data1)

    var elements = arrayOf(1,2,3,4,5)
    println(elements.contentToString())

    var data2 = intArrayOf(12,11,10,9,8)
    println(data2[1])

    var data3 = byteArrayOf(12,8,45,6,3,2)
    println(data3[2])

    var data4 = shortArrayOf(1,2,3,4,5,6)
    println(data4[1])

    var data5 = longArrayOf(1,2,3,4,5,6,7,8,9)
    println(data5[2])

    var data6 = floatArrayOf(1.2f,2.3f,3.4f,4.5f)
    println(data6[1])

    var data7 = doubleArrayOf(1.2,2.3,3.4,4.5)
    println(data7[2])

    var data8 = charArrayOf('A','B','C','D')
    println(data8[3])

    var data9 = booleanArrayOf(true,false,true,false)
    println(data9[2])

    println("The size of data9 is ${data9.size}")

}
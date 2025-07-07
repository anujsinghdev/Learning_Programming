package com.anujsinghdev.kotlin_course_01.kotlinPractice

@OptIn(ExperimentalUnsignedTypes::class)
fun main() {

    var data = Array<Int>(5){
        it
    }

    data.forEach {
        println(it)
    }

    var data1 = IntArray(5)
    data1[0] = 11
    data1[1] = 24
    data1[2] = 35
    data1[3] = 47
    data1[4] = 51

    data1.forEach {
        println(it)
    }

    var data2 = ByteArray(5)
    data2[0] = 1
    data2[1] = 2
    data2[2] = 3
    data2[3] = 4
    data2[4] = 5
    println(data2[2])

    var data3 = ShortArray(5)
    data3[0] = 122
    data3[1] = 233
    data3[2] = 344
    data3[3] = 455
    data3[4] = 566
    println(data3[2])

    var data4 = LongArray(5)
    data4[0] = 123456789
    data4[1] = 234567890
    data4[2] = 345678901
    println(data4[2])

    var data5 = FloatArray(5)
    data5[0] = 1.2f
    data5[1] = 2.3f
    data5[2] = 3.4f
    println(data5[2])

    var data6 = DoubleArray(5)
    data6[0] = 1.23
    data6[1] = 2.34
    data6[2] = 3.45
    println(data6[2])

    var data7 = BooleanArray(5)
    data7[0] = true
    data7[1] = false
    println(data7[1])

    var data8 = CharArray(5)
    data8[0] = 'A'
    data8[1] = 'B'
    println(data8[1])

    var data9 = UByteArray(3)
    data9[0] = 1u
    data9[1] = 2u
    data9[2] = 3u
    println(data9[2])

    var data10 = UShortArray(3)
    data10[0] = 1u
    data10[1] = 2u
    data10[2] = 3u
    println(data10[2])

    var data11 = UIntArray(3)
    data11[0] = 1u
    data11[1] = 2u
    data11[2] = 3u
    println(data11[2])

    var data12 = ULongArray(3)
    data12[0] = 1u
    data12[1] = 2u
    data12[2] = 3u
    println(data12[2])

}
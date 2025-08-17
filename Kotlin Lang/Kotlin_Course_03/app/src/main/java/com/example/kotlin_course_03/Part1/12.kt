package com.example.kotlin_course_03.Part1

import android.R.attr.x
import android.R.attr.y

fun main() {
    Calc1(11,22)
}

class Calc1{
    var a: Int?= null
    var b: Int?= null
    constructor(a: Int, b: Int){
        this.a = a
        this.b = b
    }

    fun add(): Int= x!!+y!!
}
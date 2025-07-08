package com.anujsinghdev.kotlin_course_01.kotlinPractice

fun main() {

    var name = """
        anuj,
        how are
        you ?
    """.trimMargin().trimIndent().trimEnd()

    println(name)

    val name1 = "Arpit"
    println(name1.reversed())

    val name2 = "Anuj"
    println(name2.uppercase())

    // and = &&
    val a = 10
    val b = 20
    val c = 8

    if (a>b && a>c) {
        println("a is greater than b and c")
    } else if (b>a && b>c) {
        println("b is greater than a and c")
    } else {
        println("c is greater than a and b")
    }

    // or = ||
    if (a>b || a>c) {
        println("a is greater than b or c")
    } else if (b>a || b>c) {
        println("b is greater than a or c")
    } else {
        println("c is greater than a or b")
    }

    // not = !
    if (a != b) {
        println("a is not equal to b")
    } else {
        println("a is equal to b")
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 1.rangeTo(15))
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 10 downTo 1 step 2)
        println(i)

    var i = 0
    while (i<=10){
        println(i)
        i++
    }

    var j = 0
    do {
        println(j)
        j++
    } while (j<=10)







}
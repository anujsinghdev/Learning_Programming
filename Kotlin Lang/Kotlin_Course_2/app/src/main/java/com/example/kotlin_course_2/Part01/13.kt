package com.example.kotlin_course_2.Part01

fun ArrayList<Int>.findMax(): Int {
    var max = this[0]
    for (element in this) {
        if (element > max) {
            max = element
        }
    }
    return max
}

fun main() {

    val listOfElements = ArrayList<Int>()
    listOfElements.add(1)
    listOfElements.add(2)
    listOfElements.add(3)
    listOfElements.add(4)
    listOfElements.add(5)

    for (element in listOfElements) {
        println(element)
    }

    val max = listOfElements.findMax()
    println("Max: $max")

}
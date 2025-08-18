package com.example.kotlin_course_05

fun main() {
    val u1 = User("Shivam", 21)
    val u2 = User("Shivam", 21)

    println(u1)
    println(u2)

    println(u1 == u2)

    val today = Day.Monday
    println("Today is $today")

    val s1 = Shape.Circle(5.0)
    val s2 = Shape.Rectangle(10.0, 20.0)
    val s3 = Shape.Triangle(10.0, 20.0)
    printShape(s1)
    printShape(s2)
    printShape(s3)

}

sealed class Shape{
    class Circle(val radius: Double) : Shape()
    class Rectangle(val width: Double, val height: Double) : Shape()
    class Triangle(val base: Double, val height: Double) : Shape()
}

fun printShape(shape: Shape){
    when(shape){
        is Shape.Circle -> println("Circle with radius ${shape.radius}")
        is Shape.Rectangle -> println("Rectangle with width ${shape.width} and height ${shape.height}")
        is Shape.Triangle -> println("Triangle with base ${shape.base} and height ${shape.height}")
    }
}


enum class Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

data class User(var name: String, var id: Int)
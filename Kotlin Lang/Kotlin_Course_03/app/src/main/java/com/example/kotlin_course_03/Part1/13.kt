package com.example.kotlin_course_03.Part1

fun main() {
    val obj = Parent()
    println(obj.name)
    println(obj.property)

    val price = 4522
    val car = Car(price)
    val bmw = BMWCar(
        price = 455
    )
    bmw.showtyers()
    println(bmw.body)
}

class Parent{
    val name = "Parent"
    val property = "Parent Property"
}

open class Car(price: Int) {
    val tyers = 4
    open val engine = "Engine"
    open val seats = 4
    open val body = "Metal"

    fun showtyers(){
        println(tyers)
    }
}

class BMWCar (val price: Int) : Car(price){
    override val engine = "BMW Engine"
    override val seats = 5
    override val body = "Leather"

}
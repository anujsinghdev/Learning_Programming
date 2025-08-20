package com.example.kotlin_course_05.Part1


abstract class Vehicle {
    abstract fun start()

    fun stop() {
        println("Stopping vehicle")
    }
}

class Car1 : Vehicle() {
    override fun start() {
        println("Starting car")
    }
}


fun main() {
    val myCar = Car1()
    myCar.start()
    myCar.stop()

}


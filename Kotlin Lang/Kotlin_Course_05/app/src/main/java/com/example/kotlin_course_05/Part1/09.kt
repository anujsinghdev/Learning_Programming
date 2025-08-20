package com.example.kotlin_course_05.Part1

fun main() {
    val anuj = Person()
    anuj.sayHello()

    val car = Car("Toyota", "Camry", 2022)
    println(car.brand)
    println(car.model)
    println(car.year)

}

class Car(val brand: String, val model: String, val year: Int){
    init {
        println("Car $brand $model was created in $year")
    }
}

class Person{
    fun sayHello(){
        println("Hello Shivam Singh")
    }
}
package com.example.kotlin_course_05

// Inheritance in Kotlin

open class Animal1 {
    fun eat() {
        println("Eating...")
    }
}

class Dog1 : Animal1() {
    fun bark() {
        println("Barking...")
    }

    fun makeSound() { // Remove 'override'
        println("Woof!")
    }
}

fun main() {
    val dog1 = Dog1()
    dog1.bark()
    dog1.eat()
    dog1.makeSound()
}
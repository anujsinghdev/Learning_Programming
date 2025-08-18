package com.example.kotlin_course_05

fun main() {
    println(greet("Anuj0"))

    val dog = Dog()
    dog.makeSound()


}

val greet: (String) -> String = {name -> "Hello $name"}

interface Animal {
    fun makeSound()
}

class Dog : Animal {
    override fun makeSound() {
        println("Woof!")
        println("Dog Barking")
    }
}
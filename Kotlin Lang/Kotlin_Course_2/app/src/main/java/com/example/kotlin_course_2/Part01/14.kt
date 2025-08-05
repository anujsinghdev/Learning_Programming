package com.example.kotlin_course_2.Part01

data class Person(val name: String, val age: Int, val gender: String)

fun main() {

    val person1 = Person("John", 25, "Male")
    val person2 = Person("Jane", 30, "Female")
    val person3 = Person("John", 25, "Male")

    println(person1)
    println(person2)
    println(person3)

    println(person1 == person2)
    println(person1 == person3)

    val person4 = person1.copy(age = 30)
    println(person4)

    val (name, age, gender) = person1
    println("$name $age $gender")

}
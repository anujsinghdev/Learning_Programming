package com.example.kotlin_course_03.Part2

fun greet(){
    println("Hello Anuj")
}

fun main() {
    greet()
    greet()
    greetNew("Anuj", "Delhi")
}


fun greetNew(name: String, address: String){
    println("Hello $name from $address")
}
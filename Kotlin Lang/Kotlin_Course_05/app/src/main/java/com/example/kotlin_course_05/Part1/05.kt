package com.example.kotlin_course_05.Part1

fun main() {
    greet()
    greet()

    greetNew("Shivam", "Delhi")

    run()
    add(10, 20)
    println(add(10, 20))
    println(add(10, 20) + 10)



}

fun greet(){
    println("Hello Welcome Shivam")
}

fun greetNew(name: String, address: String){
    println("Hello $name from $address")
}

fun run() : Unit {
    println("I am running")
}

fun add(a: Int, b: Int) : Int {
    return a + b
}
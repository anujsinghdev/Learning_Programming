package com.example.kotlin_course_05.Part2

fun main() {
    sendMessage("Shivam", "How are you?")
}

fun sendMessage(name: String, message: String = "Default Message") {
    println("Hello $name, $message")
}
package com.example.kotlin_course_05.Part1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun fetchUserData(): String {
    delay(2000)
    return "Anuj Singh"
}

fun main() {
    println("Code Start: ${Thread.currentThread().name}")

    GlobalScope.launch {
        val result = fetchUserData()
        println("User Data: $result on ${Thread.currentThread().name}")
    }

    println("this is UI code is running on ${Thread.currentThread().name}")

    Thread.sleep(5000)
    println("Code End: ${Thread.currentThread().name}")

}
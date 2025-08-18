package com.example.kotlin_course_05

fun main() {
    Database.connect()
    
}

object Database {
    fun connect(){
        println("Connected to database")
    }
}
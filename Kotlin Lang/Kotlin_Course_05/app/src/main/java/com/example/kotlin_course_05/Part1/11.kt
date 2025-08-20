package com.example.kotlin_course_05.Part1

fun main() {
    Database.connect()
    
}

object Database {
    fun connect(){
        println("Connected to database")
    }
}
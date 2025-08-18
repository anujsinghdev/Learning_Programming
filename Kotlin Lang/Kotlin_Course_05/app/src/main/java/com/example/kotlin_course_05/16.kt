package com.example.kotlin_course_05

fun fetchUser(callback: (String) -> Unit) { }

fun fetchOrders(usrData: String, callback: (String) -> Unit) { }

fun main() {
    fetchUser { usrData ->
        println(usrData)
        fetchOrders(usrData) { ordersData ->
            println(ordersData)
        }
    }
}
package com.example.kotlin_course_05

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun fetchUser(): String {
    delay(2000)
    return "User data fetched"
}

suspend fun fetchOrders(usrData: String): String {
    delay(2000)
    return " Orders data fetched"
}

suspend fun fetchOrdersDetails (ordersData: String): String {
    delay(2000)
    return " Orders Details data fetched"
}

fun main() = runBlocking {
    val usrData = fetchUser()
    println(usrData)
    val ordersData = fetchOrders(usrData)
    println(ordersData)
    val ordersDetailsData = fetchOrdersDetails(ordersData)
    println(ordersDetailsData)


}
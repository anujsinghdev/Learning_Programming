package com.example.kotlin_course_05

import kotlinx.coroutines.*
import kotlin.random.Random

// A class that simulates location updates
class LocationProvider {

    private var listener: ((String) -> Unit)? = null
    private var job: Job? = null

    // Start generating random location updates
    fun startLocationUpdates() {
        // Cancel if already running
        job?.cancel()

        job = CoroutineScope(Dispatchers.IO).launch {
            while (isActive) {
                delay(1000)
                val location = "Lat: ${Random.nextDouble(-90.0, 90.0)}, " +
                        "Lng: ${Random.nextDouble(-180.0, 180.0)}"
                listener?.invoke(location)
            }
        }
    }

    // Stop updates
    fun stopLocationUpdates() {
        job?.cancel()
        job = null
    }

    // Allow external code to set what happens when a new location comes
    fun setLocationListener(listener: (String) -> Unit) {
        this.listener = listener
    }
}

// A simple main function to test it (runs on JVM console app)
fun main() = runBlocking {
    val locationProvider = LocationProvider()

    locationProvider.setLocationListener { location ->
        println("New location: $location")
    }

    locationProvider.startLocationUpdates()

    delay(5000) // Let it run for 5 seconds
    locationProvider.stopLocationUpdates()
    println("Location updates stopped.")
}

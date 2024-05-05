package com.example.androidapp.utils

import java.util.*

object IdGenerator {
    fun get(): String {
        val timestamp = System.currentTimeMillis()
        val random = Random().nextInt(1000) // add randomness for collision avoidance
        return "${timestamp}${random}"
    }
}

// Example usage
fun main() {
    val id = IdGenerator.get()
    println("Generated ID: $id")
}
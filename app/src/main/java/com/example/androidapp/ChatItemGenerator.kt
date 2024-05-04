package com.example.androidapp

// ChatItemGenerator.kt
object ChatItemGenerator {

    fun generateSampleChatItems(): List<Chat> {
        val chatItems = mutableListOf<Chat>()
        // Add sample chat items here
        for (i in 1..10) {
            chatItems.add(Chat("Chat $i", "Last message in chat $i"))
        }
        return chatItems
    }

}

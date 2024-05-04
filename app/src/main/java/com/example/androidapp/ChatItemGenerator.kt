package com.example.androidapp

import com.example.androidapp.models.ChatList_chat

// ChatItemGenerator.kt
object ChatItemGenerator {

    fun generateSampleChatItems(): List<ChatList_chat> {
        val chatListchatItems = mutableListOf<ChatList_chat>()
        // Add sample chat items here
        for (i in 1..5) {
            chatListchatItems.add(ChatList_chat("Chat $i", "Last message in chat $i"))
        }
        return chatListchatItems
    }

}

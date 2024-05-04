package com.example.androidapp.utils

import com.example.androidapp.models.ChatList_chatButton

// ChatItemGenerator.kt
object ChatItemGenerator {

    fun generateSampleChatItems(): List<ChatList_chatButton> {
        val chatListchatItems = mutableListOf<ChatList_chatButton>()
        // Add sample chat items here
        for (i in 1..5) {
            chatListchatItems.add(ChatList_chatButton("Chat $i", "Last message in chat $i"))
        }
        return chatListchatItems
    }

}

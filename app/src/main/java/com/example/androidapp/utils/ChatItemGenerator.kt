package com.example.androidapp.utils

import com.example.androidapp.models.ChatListBtn

object ChatItemGenerator {
    fun generateSampleChatItems(): List<ChatListBtn> {
        val chatListchatItems = mutableListOf<ChatListBtn>()
        // Add sample chat items here
        for (i in 1..5) {
            chatListchatItems.add(ChatListBtn("Chat $i", "Last message in chat $i"))
        }
        return chatListchatItems
    }
}

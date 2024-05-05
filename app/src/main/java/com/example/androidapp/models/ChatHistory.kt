package com.example.androidapp.models

data class ChatHistory(
    val historyId: Long,
    val content: MutableList<ChatMessage>
)
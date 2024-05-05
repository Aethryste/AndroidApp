package com.example.androidapp.models

data class ChatMessage(
    val messageId: Long,
    val senderId: Long,
    val recipientId: Long,
    val messageContent: String,
    val timestamp: Long
)
package com.example.androidapp.controllers

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidapp.adapters.ChatAdapter
import com.example.androidapp.utils.ChatItemGenerator

object ChatListController {

    private lateinit var recyclerViewChatList: RecyclerView

    fun init(recyclerView: RecyclerView) {
        recyclerViewChatList = recyclerView

        // Generate sample chat items
        val sampleChatItems = ChatItemGenerator.generateSampleChatItems()
        val adapter = ChatAdapter(sampleChatItems)
        recyclerViewChatList.adapter = adapter
        recyclerViewChatList.layoutManager = LinearLayoutManager(recyclerView.context)
    }

    @JvmStatic
    fun main(args: Array<String>) {

    }
}
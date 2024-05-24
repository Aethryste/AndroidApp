package com.example.androidapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageButton
import com.example.androidapp.controllers.ChatTopBar

class ChatWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ChatTopBar.init(this)
        setContentView(R.layout.chat_window)


        val backbtn = findViewById<ImageButton>(R.id.backbtntopbar)

        backbtn.setOnClickListener{
            finish()

        }


        // Initialize chat-list in viewport using ChatListController
        //ChatListController.init(findViewById(R.id.recyclerViewChatList))

        // Other code here.



        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.chatWindow)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
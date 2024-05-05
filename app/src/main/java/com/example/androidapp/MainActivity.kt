package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidapp.controllers.ChatListController
import com.example.androidapp.controllers.ToolbarController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToolbarController.init(this)

        // Initialize chat-list in viewport using ChatListController
        ChatListController.init(findViewById(R.id.recyclerViewChatList))


        val nextButton = findViewById<Button>(R.id.nextbtn)

        nextButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, ChatWindow::class.java))
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
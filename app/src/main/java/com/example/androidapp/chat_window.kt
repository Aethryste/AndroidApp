package com.example.androidapp

import android.os.Bundle
import java.io.FileOutputStream
i


class chat_window {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_window)

        sendButton.setOnClickListener{

            val file = chatDisplay.text.toString()
            val fileOutputStream: FileOutputStream
        }
    }

}
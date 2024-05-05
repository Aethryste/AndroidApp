package com.example.androidapp.controllers

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import com.example.androidapp.R

object ToolbarController {

    fun init(activity: Activity) {
        val plusButton: View = activity.findViewById(R.id.imageButton)
        val parentLayout: ViewGroup = activity.findViewById(R.id.main)


        plusButton.setOnClickListener {
            // Inflate chat_window.xml layout
           // val inflater = LayoutInflater.from(activity)
           // val chatWindow = inflater.inflate(R.layout.chat_window, parentLayout, false)

            // Clear existing views from the parent layout
            parentLayout.removeAllViews()

            // Add chat_window.xml layout to the parent layout
           // parentLayout.addView(chatWindow)






        }
    }
}
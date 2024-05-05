package com.example.androidapp.controllers

import android.app.Activity
import android.view.View
import com.example.androidapp.R

object ToolbarController {

    fun init(activity: Activity) {
        val plusButton: View = activity.findViewById(R.id.imageButton)
        plusButton.setOnClickListener {

        }
    }
}
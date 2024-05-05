package com.example.androidapp.services

import org.json.JSONObject
import java.io.BufferedOutputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

object ChatService {

    fun sendMessage(message: String, senderId: String, recipientId: String, callback: (Boolean, String?) -> Unit) {
        val url = "localhost:8080/chat/history"

        val jsonObject = JSONObject().apply {
            put("message", message)
            put("senderId", senderId)
            put("recipientId", recipientId)
        }

        val postData = jsonObject.toString()
        val postDataBytes = postData.toByteArray(Charsets.UTF_8)

        val connection = URL(url).openConnection() as HttpURLConnection
        connection.apply {
            requestMethod = "POST"
            setRequestProperty("Content-Type", "application/json")
            doOutput = true
            setFixedLengthStreamingMode(postDataBytes.size)
        }

        try {
            val outputStream = BufferedOutputStream(connection.outputStream)
            outputStream.write(postDataBytes)
            outputStream.flush()

            val responseCode = connection.responseCode
            val responseBody = connection.inputStream.bufferedReader().use(BufferedReader::readText)

            if (responseCode == HttpURLConnection.HTTP_OK) {
                callback(true, responseBody)
            } else {
                callback(false, "Failed to send message: $responseCode ${connection.responseMessage}")
            }
        } catch (e: Exception) {
            callback(false, "Failed to send message: ${e.message}")
        } finally {
            connection.disconnect()
        }
    }
}


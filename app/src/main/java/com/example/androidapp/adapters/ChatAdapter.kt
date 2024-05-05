package com.example.androidapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidapp.R
import com.example.androidapp.models.ChatListBtn

class ChatAdapter(private val chatListchatItems: List<ChatListBtn>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ChatViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val currentItem = chatListchatItems[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = chatListchatItems.size

    inner class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewChatTitle: TextView = itemView.findViewById(R.id.textViewChatTitle)
        private val textViewLastMessage: TextView = itemView.findViewById(R.id.textViewLastMessage)

        fun bind(chatListchat: ChatListBtn) {
            textViewChatTitle.text = chatListchat.title
            textViewLastMessage.text = chatListchat.lastMessage
        }
    }
}

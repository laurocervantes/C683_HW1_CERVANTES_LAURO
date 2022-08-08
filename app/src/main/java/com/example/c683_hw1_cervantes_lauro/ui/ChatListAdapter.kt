package com.example.c683_hw1_cervantes_lauro.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.c683_hw1_cervantes_lauro.R
import com.example.c683_hw1_cervantes_lauro.data.Chat

class ChatListAdapter : ListAdapter<Chat, ChatListAdapter.ChatListViewHolder>(WordsComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder {
        return ChatListViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.message)
    }

    class ChatListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val wordItemView: TextView = itemView.findViewById(R.id.textView)

        fun bind(text: String?) {
            wordItemView.text = text
        }

        companion object {
            fun create(parent: ViewGroup): ChatListViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.chat_recycler_view, parent, false)
                return ChatListViewHolder(view)
            }
        }
    }

    class WordsComparator : DiffUtil.ItemCallback<Chat>() {
        override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
            return oldItem.message == newItem.message
        }
    }
}
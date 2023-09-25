package com.project.finalprojectsakigake.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.finalprojectsakigake.Database.MessageDetails
import com.project.finalprojectsakigake.R
import com.project.finalprojectsakigake.databinding.MessagesListItemBinding
import com.squareup.picasso.Picasso


class MessageAdapter(val messages: List<MessageDetails>) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MessageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MessagesListItemBinding.inflate(inflater, parent, false)
        return MessageViewHolder(binding)
    }

    override fun getItemCount() = messages.size

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val messages = messages[position]
        holder.bind(messages)
        holder.itemView.setOnClickListener {

        }

    }

    class MessageViewHolder(val binding: MessagesListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(message: MessageDetails) {
            binding.tvmessengerName.text = message.name
            binding.tvmessage.text = message.textMessage
            Picasso.get()
                .load(message.nameImageUrl)
                .error(R.drawable.english_image)
                .into(binding.imgMessagerImage)
        }

    }
}
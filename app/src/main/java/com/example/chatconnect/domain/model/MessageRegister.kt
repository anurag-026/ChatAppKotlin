package com.example.chatconnect.domain.model

import com.example.chatconnect.domain.model.ChatMessage

data class MessageRegister(
    var chatMessage: ChatMessage,
    var isMessageFromOpponent: Boolean
)
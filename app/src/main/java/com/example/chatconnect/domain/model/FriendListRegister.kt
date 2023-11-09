package com.example.chatconnect.domain.model

import com.example.chatconnect.domain.model.ChatMessage

data class FriendListRegister(
    var chatRoomUUID: String = "",
    var registerUUID: String = "",
    var requesterEmail: String = "",
    var requesterUUID: String = "",
    var requesterOneSignalUserId: String = "",
    var acceptorEmail: String = "",
    var acceptorUUID: String = "",
    var acceptorOneSignalUserId: String = "",
    var status: String = "",
    var lastMessage: ChatMessage = ChatMessage()
)
package com.example.chatconnect.domain.usecase.chatScreen

import com.example.chatconnect.domain.repository.ChatScreenRepository

class InsertMessageToFirebase(
    private val chatScreenRepository: ChatScreenRepository
) {
    suspend operator fun invoke(
        chatRoomUUID: String,
        messageContent: String,
        registerUUID: String,
        oneSignalUserId: String
    ) = chatScreenRepository.insertMessageToFirebase(
        chatRoomUUID,
        messageContent,
        registerUUID,
        oneSignalUserId
    )
}
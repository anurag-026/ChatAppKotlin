package com.example.chatconnect.domain.usecase.chatScreen

import com.example.chatconnect.domain.repository.ChatScreenRepository

class LoadOpponentProfileFromFirebase(
    private val chatScreenRepository: ChatScreenRepository
) {
    suspend operator fun invoke(opponentUUID: String) =
        chatScreenRepository.loadOpponentProfileFromFirebase(opponentUUID)
}
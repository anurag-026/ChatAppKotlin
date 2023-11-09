package com.example.chatconnect.domain.usecase.userListScreen

import com.example.chatconnect.domain.repository.UserListScreenRepository

class CreateChatRoomToFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke(acceptorUUID: String) =
        userListScreenRepository.createChatRoomToFirebase(acceptorUUID)
}
package com.example.chatconnect.domain.usecase.userListScreen

import com.example.chatconnect.domain.repository.UserListScreenRepository

class OpenBlockedFriendToFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke(registerUUID: String) =
        userListScreenRepository.openBlockedFriendToFirebase(registerUUID)
}
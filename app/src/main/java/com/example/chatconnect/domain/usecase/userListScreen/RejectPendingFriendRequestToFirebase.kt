package com.example.chatconnect.domain.usecase.userListScreen

import com.example.chatconnect.domain.repository.UserListScreenRepository

class RejectPendingFriendRequestToFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke(registerUUID: String) =
        userListScreenRepository.rejectPendingFriendRequestToFirebase(registerUUID)
}
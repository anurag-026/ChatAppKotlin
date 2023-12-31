package com.example.chatconnect.domain.usecase.userListScreen

import com.example.chatconnect.domain.repository.UserListScreenRepository

class LoadAcceptedFriendRequestListFromFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke() =
        userListScreenRepository.loadAcceptedFriendRequestListFromFirebase()
}
package com.example.chatconnect.domain.usecase.userListScreen

import com.example.chatconnect.domain.repository.UserListScreenRepository

class CheckFriendListRegisterIsExistedFromFirebase(
    private val userListScreenRepository: UserListScreenRepository
) {
    suspend operator fun invoke(
        acceptorEmail: String,
        acceptorUUID: String
    ) =
        userListScreenRepository.checkFriendListRegisterIsExistedFromFirebase(
            acceptorEmail,
            acceptorUUID
        )
}
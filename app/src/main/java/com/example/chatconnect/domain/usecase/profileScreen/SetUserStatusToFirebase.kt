package com.example.chatconnect.domain.usecase.profileScreen

import com.example.chatconnect.domain.model.UserStatus
import com.example.chatconnect.domain.repository.ProfileScreenRepository

class SetUserStatusToFirebase(
    private val profileScreenRepository: ProfileScreenRepository
) {
    suspend operator fun invoke(userStatus: UserStatus) =
        profileScreenRepository.setUserStatusToFirebase(userStatus)
}
package com.example.chatconnect.domain.usecase.profileScreen

import com.example.chatconnect.domain.model.User
import com.example.chatconnect.domain.repository.ProfileScreenRepository

class CreateOrUpdateProfileToFirebase(
    private val profileScreenRepository: ProfileScreenRepository
) {
    suspend operator fun invoke(user: User) =
        profileScreenRepository.createOrUpdateProfileToFirebase(user)
}
package com.example.chatconnect.domain.usecase.profileScreen

import com.example.chatconnect.domain.repository.ProfileScreenRepository

class SignOut(
    private val profileScreenRepository: ProfileScreenRepository
) {
    suspend operator fun invoke() = profileScreenRepository.signOut()
}
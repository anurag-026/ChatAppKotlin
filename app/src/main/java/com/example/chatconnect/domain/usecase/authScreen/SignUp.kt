package com.example.chatconnect.domain.usecase.authScreen

import com.example.chatconnect.domain.repository.AuthScreenRepository

class SignUp(
    private val authScreenRepository: AuthScreenRepository
) {
    suspend operator fun invoke(email: String, password: String) =
        authScreenRepository.signUp(email, password)
}
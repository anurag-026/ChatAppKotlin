package com.example.chatconnect.domain.usecase.profileScreen

import android.net.Uri
import com.example.chatconnect.domain.repository.ProfileScreenRepository

class UploadPictureToFirebase(
    private val profileScreenRepository: ProfileScreenRepository
) {
    suspend operator fun invoke(url: Uri) = profileScreenRepository.uploadPictureToFirebase(url)
}
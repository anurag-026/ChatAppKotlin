package com.example.chatconnect

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chatconnect.domain.model.UserStatus
import com.example.chatconnect.domain.usecase.profileScreen.ProfileScreenUseCases
import com.example.chatconnect.utils.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCases: ProfileScreenUseCases
) : ViewModel() {
    fun setUserStatusToFirebase(userStatus: UserStatus) {
        viewModelScope.launch {
            useCases.setUserStatusToFirebase(userStatus).collect { response ->
                when (response) {
                    is Response.Loading -> {}
                    is Response.Success -> {}
                    is Response.Error -> {}
                }
            }
        }
    }
}
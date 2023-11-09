package com.example.chatconnect.domain.repository

import com.example.chatconnect.domain.model.FriendListRegister
import com.example.chatconnect.domain.model.FriendListRow
import com.example.chatconnect.domain.model.User
import com.example.chatconnect.utils.Response
import kotlinx.coroutines.flow.Flow

interface UserListScreenRepository {
    suspend fun loadAcceptedFriendRequestListFromFirebase(): Flow<Response<List<FriendListRow>>>
    suspend fun loadPendingFriendRequestListFromFirebase(): Flow<Response<List<FriendListRegister>>>

    suspend fun searchUserFromFirebase(userEmail: String): Flow<Response<User?>>

    suspend fun checkChatRoomExistedFromFirebase(acceptorUUID: String): Flow<Response<String>>
    suspend fun createChatRoomToFirebase(acceptorUUID: String): Flow<Response<String>>

    suspend fun checkFriendListRegisterIsExistedFromFirebase(
        acceptorEmail: String,
        acceptorUUID: String
    ): Flow<Response<FriendListRegister>>

    suspend fun createFriendListRegisterToFirebase(
        chatRoomUUID: String,
        acceptorEmail: String,
        acceptorUUID: String,
        acceptorOneSignalUserId: String
    ): Flow<Response<Boolean>>

    suspend fun acceptPendingFriendRequestToFirebase(registerUUID: String): Flow<Response<Boolean>>
    suspend fun rejectPendingFriendRequestToFirebase(registerUUID: String): Flow<Response<Boolean>>
    suspend fun openBlockedFriendToFirebase(registerUUID: String): Flow<Response<Boolean>>
}
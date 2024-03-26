package com.example.trying

import kotlinx.serialization.Serializable

@Serializable
data class Users(
    val email: String,
    val password: String
)

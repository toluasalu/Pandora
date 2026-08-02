package com.example.pandora.core.domain

import com.example.pandora.core.model.Greeting
import kotlinx.coroutines.flow.Flow

interface GreetingRepository {
    fun observeGreeting(): Flow<Greeting>

    suspend fun refreshGreeting()
}

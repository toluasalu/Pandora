package com.example.pandora.core.data

import com.example.pandora.core.domain.GreetingRepository
import com.example.pandora.core.model.Greeting
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class DefaultGreetingRepository
    @Inject
    constructor(
        private val localDataSource: GreetingLocalDataSource,
    ) : GreetingRepository {
        override fun observeGreeting(): Flow<Greeting> = localDataSource.observeGreeting()

        override suspend fun refreshGreeting() = localDataSource.refreshGreeting()
    }

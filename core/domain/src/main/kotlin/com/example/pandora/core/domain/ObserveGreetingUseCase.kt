package com.example.pandora.core.domain

import com.example.pandora.core.model.Greeting
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObserveGreetingUseCase
    @Inject
    constructor(
        private val repository: GreetingRepository,
    ) {
        operator fun invoke(): Flow<Greeting> = repository.observeGreeting()
    }

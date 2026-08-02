package com.example.pandora.core.data

import com.example.pandora.core.domain.GreetingRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {
    @Binds
    @Singleton
    abstract fun bindGreetingLocalDataSource(implementation: InMemoryGreetingLocalDataSource): GreetingLocalDataSource

    @Binds
    @Singleton
    abstract fun bindGreetingRepository(implementation: DefaultGreetingRepository): GreetingRepository
}

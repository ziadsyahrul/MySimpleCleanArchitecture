package com.ziadsyahrul.mysimplecleanarchitecture.di

import com.ziadsyahrul.mysimplecleanarchitecture.data.IMessageDataSource
import com.ziadsyahrul.mysimplecleanarchitecture.data.MessageDataSource
import com.ziadsyahrul.mysimplecleanarchitecture.data.MessageRepository
import com.ziadsyahrul.mysimplecleanarchitecture.domain.IMessageRepository
import com.ziadsyahrul.mysimplecleanarchitecture.domain.MessageInteractor
import com.ziadsyahrul.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
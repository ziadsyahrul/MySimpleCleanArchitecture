package com.ziadsyahrul.mysimplecleanarchitecture.data

import com.ziadsyahrul.mysimplecleanarchitecture.domain.IMessageRepository
import com.ziadsyahrul.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)

}
package com.ziadsyahrul.mysimplecleanarchitecture.data

import com.ziadsyahrul.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}
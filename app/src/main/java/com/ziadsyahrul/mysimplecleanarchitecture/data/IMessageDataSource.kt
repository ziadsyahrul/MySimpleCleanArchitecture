package com.ziadsyahrul.mysimplecleanarchitecture.data

import com.ziadsyahrul.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity

}
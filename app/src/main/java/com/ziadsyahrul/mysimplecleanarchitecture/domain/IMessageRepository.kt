package com.ziadsyahrul.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}
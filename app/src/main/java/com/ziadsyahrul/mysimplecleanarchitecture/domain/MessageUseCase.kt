package com.ziadsyahrul.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}
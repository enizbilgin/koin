package com.enzz.core.application.implementations

import com.enzz.core.application.interfaces.HttpClient

class HttpClientImpl : HttpClient {

    override fun giveHello() = "Hello Koin"
}
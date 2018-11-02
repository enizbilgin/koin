package com.enzz.koin.app.implementation

import com.enzz.core.application.interfaces.HttpClient


class AppHttpClient : HttpClient {

    override fun giveHello() = "Eniz"
}
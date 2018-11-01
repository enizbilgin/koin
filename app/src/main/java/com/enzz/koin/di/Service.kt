package com.enzz.koin.di

import android.content.Context

class Service(private val context: Context,
              private val configuration: IConfiguration,
              private val httpClient: IHttpClient) : IService {


    override fun sayAppName(): String? = context.packageName

    override fun sayHello() = httpClient.giveHello()

    override fun sayYourName() = configuration.sayMyName()
}
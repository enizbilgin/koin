package com.enzz.core.application.implementations

import android.content.Context
import com.enzz.core.application.interfaces.Configuration
import com.enzz.core.application.interfaces.HttpClient
import com.enzz.core.application.interfaces.Service

class ServiceImpl(private val context: Context,
                  private val configuration: Configuration,
                  private val httpClient: HttpClient) : Service {


    override fun sayAppName(): String? = context.packageName

    override fun sayHello() = httpClient.giveHello()

    override fun sayYourName() = configuration.sayMyName()
}
package com.enzz.koin.app

import android.app.Application
import com.enzz.koin.di.*
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.startKoin

class KoinApplication : Application() {

    // Lazy injected HttpClient
    private val httpClient: IHttpClient by inject()
    // Lazy injected Configuration
    private val configuration: IConfiguration by inject()
    // Lazy injected Service
    private val service: IService by inject()

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin(this, listOf(appModule, activityModule, appHttpClientModule))

        println(httpClient.giveHello())
        println(configuration.sayMyName())
        println(service.sayAppName())
    }
}
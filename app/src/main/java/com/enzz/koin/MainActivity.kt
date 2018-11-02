package com.enzz.koin

import android.os.Bundle
import com.enzz.koin.app.AbstractActivity
import com.enzz.koin.di.IConfiguration
import com.enzz.koin.di.IHttpClient
import com.enzz.koin.di.Service
import org.koin.android.ext.android.inject

class MainActivity : AbstractActivity() {

    // Lazy injected HttpClient
    private val httpClient: IHttpClient by inject()

    // Lazy injected Configuration
    private val configuration: IConfiguration by inject()

    // Lazy injected Configuration
    private val service: Service by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(httpClient.giveHello())
        println(configuration.sayMyName())
        println(service.sayHello())
        presenter.showAlert()

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.content, MainFragment())
        transaction.commit()
    }
}

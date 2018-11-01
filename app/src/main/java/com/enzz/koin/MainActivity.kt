package com.enzz.koin

import android.os.Bundle
import com.enzz.koin.app.AbstractActivity
import com.enzz.koin.di.*
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

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

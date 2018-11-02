package com.enzz.core.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enzz.core.application.interfaces.Configuration
import com.enzz.core.application.interfaces.HttpClient
import com.enzz.core.application.interfaces.Presenter
import com.enzz.core.application.interfaces.Service
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

abstract class AbstractActivity : AppCompatActivity() {

    // Lazy injected HttpClientImpl
    protected val httpClient: HttpClient by inject()

    // Lazy injected ConfigurationImpl
    protected val configuration: Configuration by inject()

    // Lazy injected ConfigurationImpl
    protected val service: Service by inject()

    // inject this as PresenterImpl value
    protected val presenter: Presenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println(httpClient.giveHello())
        println(service.sayHello())
    }
}
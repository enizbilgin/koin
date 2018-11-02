package com.enzz.core.application

import android.app.Application
import com.enzz.core.application.interfaces.Configuration
import com.enzz.core.application.interfaces.HttpClient
import com.enzz.core.application.interfaces.Service
import com.enzz.core.di.coreActivityModule
import com.enzz.core.di.coreAppModule
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module


/**
 * Created by eniz.bilgin on 2.11.2018.
 */

abstract class AbstractApplication : Application() {

    // Lazy injected HttpClientImpl
    private val httpClient: HttpClient by inject()
    // Lazy injected ConfigurationImpl
    private val configuration: Configuration by inject()
    // Lazy injected ServiceImpl
    private val service: Service by inject()

    override fun onCreate() {
        super.onCreate()

        val moduleList = arrayListOf(coreAppModule, coreActivityModule)

        setupModules(moduleList)

        // Start Koin
        startKoin(this, moduleList)
    }

    abstract fun setupModules(list: ArrayList<Module>)
}
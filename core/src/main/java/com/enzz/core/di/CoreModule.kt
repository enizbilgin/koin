package com.enzz.core.di

import com.enzz.core.application.implementations.ConfigurationImpl
import com.enzz.core.application.implementations.HttpClientImpl
import com.enzz.core.application.implementations.PresenterImpl
import com.enzz.core.application.implementations.ServiceImpl
import com.enzz.core.application.interfaces.Configuration
import com.enzz.core.application.interfaces.HttpClient
import com.enzz.core.application.interfaces.Presenter
import com.enzz.core.application.interfaces.Service
import com.enzz.core.presentation.activities.AbstractActivity
import org.koin.dsl.module.module

/**
 * Created by eniz.bilgin on 2.11.2018.
 */

val coreAppModule = module {

    single<HttpClient> { HttpClientImpl() }
    single<Configuration> { ConfigurationImpl(get()) }
    // single<Service> { ServiceImpl(get(), get(), get()) }
    // Will match types ServiceImp & ServiceImpl
    single { ServiceImpl(get(), get(), get()) } bind Service::class

}

val coreActivityModule = module {

    factory<Presenter> { (activity: AbstractActivity) -> PresenterImpl(activity, get()) }
}
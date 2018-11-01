package com.enzz.koin.di

import com.enzz.koin.app.AbstractActivity
import org.koin.dsl.module.module

val appModule = module {

    single<IHttpClient> { HttpClient() }
    single<IConfiguration> { Configuration(get()) }
    // single<IService> { Service(get(), get(), get()) }

    // Will match types ServiceImp & Service
    single { Service(get(), get(), get()) } bind IService::class

}

val activityModule = module {

    // Scoped MyScopePresenter instance
    bean<IPresenter>("AbstractActivity") { (activity: AbstractActivity) -> Presenter(activity, get()) }

    //factory <IPresenter> { (activity: AbstractActivity) -> Presenter(activity, get()) }
}

val appHttpClientModule = module(override = true) {

    single<IHttpClient> { AppHttpClient() }
}
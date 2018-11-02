package com.enzz.koin.di

import com.enzz.core.application.interfaces.HttpClient
import com.enzz.core.application.interfaces.Presenter
import com.enzz.core.presentation.activities.AbstractActivity
import com.enzz.koin.app.implementation.AppHttpClient
import com.enzz.koin.app.implementation.AppPresenterImpl
import com.enzz.koin.app.implementation.FragmentManagementImpl
import com.enzz.koin.app.interfaces.FragmentManagement
import org.koin.dsl.module.module


val appModule = module(override = true) {

    single<HttpClient> { AppHttpClient() }

}

val activityModule = module(override = true) {

    factory<FragmentManagement> { (activity: AbstractActivity) -> FragmentManagementImpl(activity) }

    factory<Presenter> { (activity: AbstractActivity) -> AppPresenterImpl(activity, get()) }
}


package com.enzz.koin.di

import com.enzz.core.application.interfaces.HttpClient
import com.enzz.core.presentation.activities.AbstractActivity
import com.enzz.koin.app.implementation.AppHttpClient
import com.enzz.koin.app.implementation.FragmentManagementImpl
import com.enzz.koin.app.interfaces.FragmentManagement
import org.koin.dsl.module.module


val appModule = module(override = true) {

    single<HttpClient> { AppHttpClient() }

}

val activityModule = module {

    factory<FragmentManagement> { (activity: AbstractActivity) -> FragmentManagementImpl(activity) }
}


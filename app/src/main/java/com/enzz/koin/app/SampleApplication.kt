package com.enzz.koin.app

import com.enzz.core.application.AbstractApplication
import com.enzz.koin.di.activityModule
import com.enzz.koin.di.appModule
import org.koin.dsl.module.Module

class SampleApplication : AbstractApplication() {

    override fun setupModules(list: ArrayList<Module>) {
        // override app module
        list.add(appModule)
        list.add(activityModule)
    }

}
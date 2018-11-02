package com.enzz.koin.screen.about.activites

import android.os.Bundle
import com.enzz.core.presentation.activities.AbstractActivity
import com.enzz.koin.R

class AboutActivity : AbstractActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        println(httpClient.giveHello())
        println(configuration.sayMyName())
        println(service.sayHello())
    }
}

package com.enzz.core.application.implementations

import android.content.Context
import com.enzz.core.application.interfaces.Configuration

class ConfigurationImpl(private val context: Context) : Configuration {

    override fun sayMyName() = "Koin"
}
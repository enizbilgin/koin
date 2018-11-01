package com.enzz.koin.di

import android.content.Context

class Configuration(private val context: Context) : IConfiguration {

    override fun sayMyName() = "Koin"
}
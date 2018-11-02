package com.enzz.koin.screen.home.activities

import android.os.Bundle
import com.enzz.core.presentation.activities.AbstractActivity
import com.enzz.koin.R
import com.enzz.koin.app.interfaces.FragmentManagement
import com.enzz.koin.screen.home.fragments.MainFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AbstractActivity() {

    // inject this as FragmentManagementImpl value
    private val fragmentManagement: FragmentManagement by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManagement.pushFragment(R.id.content, MainFragment())

    }
}

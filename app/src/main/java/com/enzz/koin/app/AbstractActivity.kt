package com.enzz.koin.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enzz.koin.di.IPresenter
import org.koin.android.ext.android.inject
import org.koin.android.scope.ext.android.bindScope
import org.koin.android.scope.ext.android.getOrCreateScope
import org.koin.core.parameter.parametersOf

abstract class AbstractActivity : AppCompatActivity() {

    // inject this as Presenter value
    protected val presenter: IPresenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activitySession = getOrCreateScope("AbstractActivity")

        bindScope(activitySession)
    }
}
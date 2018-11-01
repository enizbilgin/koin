package com.enzz.koin

import android.os.Bundle
import com.enzz.koin.app.AbstractActivity

class HomeActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        presenter.showAlert()

    }
}

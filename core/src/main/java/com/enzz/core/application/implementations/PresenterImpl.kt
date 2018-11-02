package com.enzz.core.application.implementations

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.enzz.core.application.interfaces.Configuration
import com.enzz.core.application.interfaces.Presenter


class PresenterImpl(private val context: AppCompatActivity, val configuration: Configuration) : Presenter {

    override fun showAlert(): String {

        val builder: AlertDialog.Builder

        builder = AlertDialog.Builder(context)
        builder.setTitle("Koin")
                .setMessage("Are you like KOIN")
                .setPositiveButton(android.R.string.yes, { dialog, which ->
                    // continue with delete
                })
                .setNegativeButton(android.R.string.no, { dialog, which ->
                    // do nothing
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()

        return configuration.sayMyName()
    }
}
package com.enzz.koin.app.implementation

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.enzz.core.application.interfaces.Configuration
import com.enzz.core.application.interfaces.Presenter
import com.enzz.koin.R

/**
 * Created by eniz.bilgin on 2.11.2018.
 */


class AppPresenterImpl(private val context: AppCompatActivity, private val configuration: Configuration) : Presenter {

    override fun showAlert(): String {

        val builder: AlertDialog.Builder = AlertDialog.Builder(context, R.style.AppCompatAlertDialogStyle)

        builder.setTitle("Koin")
                .setMessage("Are you like KOIN")
                .setPositiveButton(android.R.string.yes) { dialog, which ->
                    // continue with delete
                }
                .setNegativeButton(android.R.string.no) { dialog, which ->
                    // do nothing
                }
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()

        return configuration.sayMyName()
    }

}
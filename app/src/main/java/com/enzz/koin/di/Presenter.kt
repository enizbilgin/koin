package com.enzz.koin.di

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class Presenter(private val context: AppCompatActivity, val configuration: IConfiguration) : IPresenter {

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
package com.enzz.koin.screen.home.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzz.core.presentation.fragments.AbstractFragment
import com.enzz.koin.R
import com.enzz.koin.screen.about.activites.AboutActivity
import kotlinx.android.synthetic.main.fragment_home.*

class MainFragment : AbstractFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        aboutButton.setOnClickListener {
            startActivity(Intent(requireContext(), AboutActivity::class.java))
        }

        presentButton.setOnClickListener {
            presenter.showAlert()
        }
    }
}
package com.enzz.koin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzz.koin.di.IPresenter
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainFragment : Fragment() {

    // inject this as Presenter value
    // inject this as Presenter value
    private val presenter: IPresenter by inject { parametersOf(requireActivity()) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeButton.setOnClickListener {
            startActivity(Intent(requireContext(), HomeActivity::class.java))
        }

        homeButton.setOnClickListener {
            presenter.showAlert()
        }

    }
}
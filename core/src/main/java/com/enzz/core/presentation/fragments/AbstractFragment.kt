package com.enzz.core.presentation.fragments

import androidx.fragment.app.Fragment
import com.enzz.core.application.interfaces.Presenter
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

/**
 * Created by eniz.bilgin on 2.11.2018.
 */

abstract class AbstractFragment : Fragment() {

    // inject this as PresenterImpl value
    protected val presenter: Presenter by inject { parametersOf(requireActivity()) }

}
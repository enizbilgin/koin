package com.enzz.koin.app.interfaces

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

/**
 * Created by eniz.bilgin on 2.11.2018.
 */

interface FragmentManagement {

    fun pushFragment(@IdRes layoutId: Int, fragment: Fragment)

}
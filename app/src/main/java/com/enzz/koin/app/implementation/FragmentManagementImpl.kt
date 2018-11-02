package com.enzz.koin.app.implementation

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.enzz.koin.app.interfaces.FragmentManagement

/**
 * Created by eniz.bilgin on 2.11.2018.
 */

class FragmentManagementImpl(private val context: AppCompatActivity) : FragmentManagement {

    override fun pushFragment(@IdRes layoutId: Int, fragment: Fragment) {

        val manager = context.supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(layoutId, fragment)
        transaction.commit()
    }

}
package com.rodak.utlis.extensions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun Fragment.display(supportFragmentManager: FragmentManager, containerViewId: Int, fragmentTag: String) {
    val fragmentTransaction = supportFragmentManager.beginTransaction()
    fragmentTransaction.replace(containerViewId, this, fragmentTag)
    fragmentTransaction.commit()
}
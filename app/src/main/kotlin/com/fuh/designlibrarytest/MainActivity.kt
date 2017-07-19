package com.fuh.designlibrarytest

import com.app.ankotest.utils.baseviews.BaseAppCompatActivity
import org.jetbrains.anko.AnkoComponent

/**
 * Created by lll on 18.07.2017.
 */
class MainActivity : BaseAppCompatActivity() {

    override fun <T : BaseAppCompatActivity> getUI(): AnkoComponent<T> {
        return MainActivityUI() as AnkoComponent<T>
    }
}
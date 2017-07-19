package com.app.ankotest.utils.baseviews

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.setContentView

/**
 * Created by lll on 15.06.2017.
 */
abstract class BaseAppCompatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getUI<BaseAppCompatActivity>().setContentView(this)
    }

    protected abstract fun <T : BaseAppCompatActivity> getUI(): AnkoComponent<T>
}
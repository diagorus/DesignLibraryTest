package com.fuh.designlibrarytest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.app.ankotest.utils.baseviews.BaseAppCompatActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.find

/**
 * Created by lll on 18.07.2017.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = find<Toolbar>(R.id.tbDesignTestToolbar)

        toolbar.title = "TOOLBAR_TITLE"

        setSupportActionBar(toolbar)
    }
}
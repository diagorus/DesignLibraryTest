package com.fuh.designlibrarytest

import android.view.View
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.collapsingToolbarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4.nestedScrollView
import org.jetbrains.anko.support.v4.viewPager

/**
 * Created by lll on 18.07.2017.
 */
class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        coordinatorLayout {
            collapsingToolbarLayout {  }
            appBarLayout {  }
            nestedScrollView {  }
            viewPager {  }
            navigationView {  }
        }
    }
}
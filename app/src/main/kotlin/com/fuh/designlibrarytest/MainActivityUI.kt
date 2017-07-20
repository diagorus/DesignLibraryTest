package com.fuh.designlibrarytest

import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.View
import com.fuh.designlibrarytest.util.dimenAttr
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.support.v4.nestedScrollView
import com.fuh.designlibrarytest.util.collapsingToolbarLparams
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.*

/**
 * Created by lll on 18.07.2017.
 */
class MainActivityUI : AnkoComponent<MainActivity> {
    lateinit var coordinator: CoordinatorLayout
    lateinit var toolbar: Toolbar

    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        coordinator = coordinatorLayout {
            id = R.id.clDesignTestCoordinator

            nestedScrollView {
                id = R.id.nsvDesignTestNested

                textView {
                    id = R.id.tvDesignTestText

                    textResource = R.string.stub_text
                }
            }.lparams(width = matchParent, height = matchParent) {
                behavior = AppBarLayout.ScrollingViewBehavior()
            }

            appBarLayout {
                collapsingToolbarLayout {
                    toolbar = toolbar {
                        id = R.id.tbDesignTestToolbar

                    }.collapsingToolbarLparams(width = matchParent, height = dimenAttr(R.attr.actionBarSize)) {
                        collapseMode =
                                CollapsingToolbarLayout.LayoutParams.COLLAPSE_MODE_PIN
                    }
                }.lparams(width = matchParent, height = matchParent) {
                    scrollFlags =
                            AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or
//                                    AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED or
                                    AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED
//                            AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or
//                                    AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED or
//                                    AppBarLayout.LayoutParams.SCROLL_FLAG_SNAP
                }
            }.lparams(width = matchParent, height = dip(192))

            floatingActionButton {
                onClick { snackbar(coordinator, "Snackbar", "Action") { toast("Action click") } }
            }.lparams {
                margin = dip(8)
                anchorId = R.id.nsvDesignTestNested
                anchorGravity = Gravity.BOTTOM or Gravity.END
            }
        }

        coordinator
    }

    //            nestedScrollView {  }
    //            viewPager {  }
    //            navigationView {  }
    //            textInputLayout {  }
    //            bottomNavigationView {  }
}
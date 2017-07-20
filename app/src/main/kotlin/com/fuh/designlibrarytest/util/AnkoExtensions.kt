package com.fuh.designlibrarytest.util

import android.content.Context
import android.support.annotation.AttrRes
import android.support.design.widget.CollapsingToolbarLayout
import android.util.TypedValue
import android.view.View
import org.jetbrains.anko.wrapContent

/**
 * Created by lll on 19.07.2017.
 */
fun <T : android.view.View> T.collapsingToolbarLparams(
        width: kotlin.Int = wrapContent,
        height: kotlin.Int = wrapContent,
        init: android.support.design.widget.CollapsingToolbarLayout.LayoutParams.() -> kotlin.Unit = {}): T {
    val layoutParams = android.support.design.widget.CollapsingToolbarLayout.LayoutParams(width, height)
    layoutParams.init()
    this.layoutParams = layoutParams
    return this
}

fun Context.attr(value : Int) : TypedValue {
    val ret = TypedValue()
    theme.resolveAttribute(value, ret, true)
    return ret
}

fun Context.dimenAttr(value : Int): Int {
    return TypedValue.complexToDimensionPixelSize(attr(value).data, resources.displayMetrics)
}
fun View.dimenAttr(@AttrRes attribute: Int): Int = context.dimenAttr(attribute)
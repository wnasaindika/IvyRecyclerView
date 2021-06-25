package com.ivy.recyclerview.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import java.util.*

abstract class BaseViewHolder<T, L : BaseListener> : RecyclerView.ViewHolder {
    var l: L? = null

    constructor(itemView: View) : super(itemView)
    constructor(itemView: View, l: L) : super(itemView) {
        this.l = l
    }

    abstract fun onBind(item: T)
    fun onBind(item: T, o: List<Objects>) {
        onBind(item)
    }
}
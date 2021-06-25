package com.ivy.recyclerview.base

import androidx.recyclerview.widget.DiffUtil

abstract class BaseDiffCallBack<T>(private var oldItems: List<T>, private var newItem: List<T>) :
    DiffUtil.Callback() {
    override fun getNewListSize(): Int = newItem.size
    override fun getOldListSize(): Int = oldItems.size
}
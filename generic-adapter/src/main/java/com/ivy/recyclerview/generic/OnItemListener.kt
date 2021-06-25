package com.ivy.recyclerview.generic

import com.ivy.recyclerview.base.BaseListener

interface OnItemListener : BaseListener {
    fun onItemClick(position:Int)
}
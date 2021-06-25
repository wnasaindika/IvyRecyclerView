package com.ivy.sample.ui.adapter

import android.view.ViewGroup
import com.ivy.recyclerview.base.BaseViewHolder
import com.ivy.recyclerview.generic.GenericAdapter
import com.ivy.recyclerview.generic.OnItemListener
import com.ivy.sample.data.RowData

class MultiViewAdapter(t: MutableList<RowData>) :
    GenericAdapter<RowData, OnItemListener, BaseViewHolder<RowData, OnItemListener>>(t) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BaseViewHolder<RowData, OnItemListener> {
        TODO("Not yet implemented")
    }
}
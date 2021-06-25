package com.ivy.recyclerview.generic

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ivy.recyclerview.base.BaseListener
import com.ivy.recyclerview.base.BaseViewHolder

abstract class GenericAdapter<T, L : BaseListener, VH : BaseViewHolder<T, L>>(private var t: MutableList<T>) :
    RecyclerView.Adapter<VH>() {
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
    override fun onBindViewHolder(holder: VH, position: Int) {
        if (t.isEmpty())
            return
        else
            holder.onBind(t[position])
    }

    override fun getItemCount(): Int = t.size

    fun setItems(i: List<T>?, notify: Boolean) {
        if (i == null) {
            throw IllegalArgumentException("Cannot set `null` item to the Recycler adapter");
        }
        t.clear();
        t.addAll(i);
        if (notify) {
            notifyDataSetChanged();
        }
    }

    fun updateItems(n: List<T>, diffCallback: DiffUtil.Callback) {
        val result = DiffUtil.calculateDiff(diffCallback)
        setItems(n, false)
        result.dispatchUpdatesTo(this)
    }
}
package com.example.agropokemon.Recycler

import androidx.recyclerview.widget.DiffUtil
import com.example.agropokemon.Models.Pokemon

class DiffUtils(
    val oldList: List<Pokemon>,
    val newList: List<Pokemon>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition + 1].id == newList[newItemPosition + 1].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition + 1] == newList[newItemPosition + 1]
    }
}
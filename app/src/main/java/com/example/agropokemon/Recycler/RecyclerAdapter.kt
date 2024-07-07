package com.example.agropokemon.Recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.databinding.ListItemBinding


class RecyclerAdapter
    : RecyclerView.Adapter<PokemonViewHolder>() {

    private var pokeList = listOf<Pokemon>()
    var onClickFun: (Pokemon) -> Unit = {}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            ),
            onClickFun
        )
    }


    override fun getItemCount(): Int {
        return pokeList.size
    }

    fun submit(newPokeList: List<Pokemon>) {
        val diffUtilCallback = DiffUtils(pokeList, newPokeList)
        pokeList = newPokeList
        DiffUtil.calculateDiff(diffUtilCallback).dispatchUpdatesTo(this)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokeList[position])
    }
}
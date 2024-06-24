package com.example.agropokemon.Recycler

import androidx.recyclerview.widget.RecyclerView
import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.databinding.ListItemBinding

class PokemonViewHolder (var binding: ListItemBinding, var  onClickFun: (Pokemon)->Unit)
    : RecyclerView.ViewHolder(binding.root){
        fun bind(pokemon: Pokemon) {
            pokemon.let {
                binding.imageViewIcon.setImageResource(it.image)
                binding.pokNameTextView.text= it.name
                binding.root.setOnClickListener{
                        onClickFun(pokemon)
                }
            }
        }
    }

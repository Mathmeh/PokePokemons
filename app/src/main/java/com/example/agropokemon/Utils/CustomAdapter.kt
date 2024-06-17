package com.example.agropokemon.Utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.R


class CustomAdapter(context: Context, private val pokemonList: List<Pokemon>) : BaseAdapter() {

        private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        override fun getCount(): Int {
            return pokemonList.size
        }

        override fun getItem(position: Int): Any {
            return pokemonList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view = convertView ?: inflater.inflate(R.layout.list_item, parent, false)

            val pokemon = pokemonList[position]

            val nameTextView = view.findViewById<TextView>(R.id.pok_name_textView)
            val imageView = view.findViewById<ImageView>(R.id.image_view_icon)

            nameTextView.text = pokemon.name
            imageView.setImageResource(pokemon.image)

            return view
        }

    }
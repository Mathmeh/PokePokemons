package com.example.agropokemon

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.agropokemon.DataRepository.getAllPokemonNames
import com.example.agropokemon.DataRepository.getAllPokemons
import com.example.agropokemon.DataRepository.pokemons
import com.example.agropokemon.R.id
import com.example.agropokemon.R.layout.list_item
import com.example.agropokemon.Utils.CustomAdapter
import com.example.agropokemon.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CustomAdapter(this@MainActivity, getAllPokemons().toList())
        binding.pokemonListView.adapter = adapter






    }
}
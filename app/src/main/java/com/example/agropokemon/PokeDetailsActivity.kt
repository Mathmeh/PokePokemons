package com.example.agropokemon.com.example.agropokemon

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.agropokemon.DataRepository.pokemons
import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.databinding.PokedetailsActivityBinding


class PokeDetailsActivity : AppCompatActivity() {
    private lateinit var  binding: PokedetailsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PokedetailsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokemonId = intent.extras?.getInt("poke_id", -1)
        val pokemon = pokemons.get(pokemonId)

        pokemon?.let {
            setPokeData(binding, pokemon)
        } ?: run {
            pokemonMissed()
        }
    }

    fun setPokeData(binding: PokedetailsActivityBinding, pokemon: Pokemon){
        with(binding) {
            pokeImageView.setImageResource(pokemon.image)
            expTextView.text ="EXP ${pokemon.baseExperience}"
            nameTextView.text = pokemon.name
            heightTextView.text = "Height: ${pokemon.height}"
            weightTextView.text = "Weight: ${pokemon.weight}"

        }
    }

    fun pokemonMissed(){
        Log.e("MissError", "This creature is missing!!!");
        Toast.makeText(this, "This creature is missing!!!", Toast.LENGTH_SHORT)
    }
}
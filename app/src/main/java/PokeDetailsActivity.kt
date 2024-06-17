package com.example.agropokemon

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

        if (pokemonId != null && pokemonId!=-1) {

             var  pokemon = pokemons.get(pokemonId)

             if (pokemon != null) {
                setPokeData(binding, pokemon)
             } else {
                 pokemonMissed()
             }

        } else {
            pokemonMissed()
        }
    }

    fun setPokeData(binding: PokedetailsActivityBinding, pokemon: Pokemon){

        binding.pokeImageView.setImageResource(pokemon.image)
        binding.expTextView.text ="EXP "+pokemon.baseExperience
        binding.nameTextView.text = pokemon.name
        binding.heightTextView.text = "Height: "+pokemon.height
        binding.weightTextView.text = "Weight: "+pokemon.weight
    }

    fun pokemonMissed(){
        Log.e("MissError", "This creature is missing!!!");
        Toast.makeText(this, "This creature is missing!!!", Toast.LENGTH_SHORT)
    }
}
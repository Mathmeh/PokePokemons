package com.example.agropokemon


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.agropokemon.DataRepository.pokemons
import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pokemons.forEach {
            setPokemon(binding, it.value)
        }

  }

    private fun setPokemon(binding: ActivityMainBinding, pokemon: Pokemon) {
        val inflater = LayoutInflater.from(this)
        val view = inflater.inflate(R.layout.list_item, null)

        val img = view.findViewById<ImageView>(R.id.image_view_icon)
        val name = view.findViewById<TextView>(R.id.pok_name_text_view)

        img.setImageResource(pokemon.image)
        name.text = pokemon.name

        view.setOnClickListener{
            val intent = Intent(this@MainActivity, PokeDetailsActivity::class.java).apply {
                putExtra("poke_id", pokemon.id)
            }
            startActivity(intent)
        }

        binding.pokelistLinear?.addView(view)
    }
}
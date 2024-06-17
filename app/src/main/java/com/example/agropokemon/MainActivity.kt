package com.example.agropokemon


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.agropokemon.DataRepository.getAllPokemons
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


        binding.pokemonListView.setOnItemClickListener { parent, view, position, id ->

            val element = adapter.getItem(position)

            val intent = Intent(this@MainActivity, PokeDetailsActivity::class.java).apply {
                putExtra("poke_id", position+1)

        }
            startActivity(intent)
    }
  }
}
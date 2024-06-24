package com.example.agropokemon


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.agropokemon.DataRepository.getAllPokemons
import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.Recycler.RecyclerAdapter
import com.example.agropokemon.com.example.agropokemon.PokeDetailsActivity
import com.example.agropokemon.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = RecyclerAdapter()
        adapter.onClickFun = { pokemon ->
            setPokemon(pokemon)
        }

        binding.pokemonsRecyclerView?.adapter = adapter
        adapter.submit(getAllPokemons().toList())
        binding.pokemonsRecyclerView?.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.pokemonsRecyclerView?.addItemDecoration(
            DividerItemDecoration(
                baseContext,
                VERTICAL
            )
        )
    }

    private fun setPokemon(pokemon: Pokemon) {

        val intent = Intent(this@MainActivity, PokeDetailsActivity::class.java).apply {
            putExtra("poke_id", pokemon.id)
        }
        startActivity(intent)
    }
}

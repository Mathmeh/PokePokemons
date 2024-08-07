package com.example.agropokemon.DataRepository

import com.example.agropokemon.Models.Pokemon
import com.example.agropokemon.R

val pokemons: HashMap<Int, Pokemon> = HashMap(listOf(
    Pokemon(
        id = 1,
        name = "Bulbasaur",
        weight = 69,
        height = 7,
        baseExperience = 64,
        image = R.drawable.pok1
    ),
    Pokemon(
        id = 2,
        name = "Ivysaur",
        weight = 130,
        height = 10,
        baseExperience = 142,
        image = R.drawable.pok2
    ),
    Pokemon(
        id = 3,
        name = "Venusaur",
        weight = 1000,
        height = 20,
        baseExperience = 263,
        image = R.drawable.pok3
    ),
    Pokemon(
        id = 4,
        name = "Charmander",
        weight = 85,
        height = 6,
        baseExperience = 52,
        image = R.drawable.pok4
    ),

    Pokemon(
        id = 5,
        name = "Charmeleon",
        weight = 190,
        height = 11,
        baseExperience = 142,
        image = R.drawable.pok5
    ),
    Pokemon(
        id = 6,
        name = "Charizard",
        weight = 905,
        height = 17,
        baseExperience = 267,
        image = R.drawable.pok6
    ),

    Pokemon(
        id = 7,
        name = "Squirtle",
        weight = 90,
        height = 5,
        baseExperience = 63,
        image = R.drawable.pok7
    ),
    Pokemon(
        id = 8,
        name = "Wartortle",
        weight = 855,
        height = 10,
        baseExperience = 142,
        image = R.drawable.pok8
    ),
    Pokemon(
        id = 9,
        name = "Blastoise",
        weight = 855,
        height = 16,
        baseExperience = 265,
        image = R.drawable.pok9
    ),
    Pokemon(
        id = 10,
        name = "Caterpie",
        weight = 29,
        height = 3,
        baseExperience = 39,
        image = R.drawable.pok10
    ),


    ).associateBy { it.id })

fun getAllPokemons(): MutableCollection<Pokemon> {
    return pokemons.values
}
package com.example.agropokemon.Models

class Pokemon(
    val id: Int,
    val name: String,
    val weight: Int,
    val height: Int,
    val baseExperience: Int,
    val image: Int
)
{
    override fun toString(): String {
        return name
    }
}

package com.example.agropokemon.Models

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<String>,
    val weight: Int,
    val height: Int,
    val baseExperience: Int,
    val image: Int
)

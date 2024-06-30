package com.example.agropokemon.Models

import androidx.annotation.DrawableRes

class Pokemon(
    val id: Int,
    val name: String,
    val weight: Int,
    val height: Int,
    val baseExperience: Int,
    @DrawableRes
    val image: Int
) {
    override fun toString(): String {
        return name
    }
}

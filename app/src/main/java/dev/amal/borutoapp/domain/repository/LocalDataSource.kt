package dev.amal.borutoapp.domain.repository

import dev.amal.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}
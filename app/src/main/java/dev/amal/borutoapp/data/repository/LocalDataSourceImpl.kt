package dev.amal.borutoapp.data.repository

import dev.amal.borutoapp.data.local.BorutoDatabase
import dev.amal.borutoapp.domain.model.Hero
import dev.amal.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero =
        heroDao.getSelectedHero(heroId = heroId)
}
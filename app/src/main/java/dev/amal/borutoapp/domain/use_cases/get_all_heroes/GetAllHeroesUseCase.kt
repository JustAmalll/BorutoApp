package dev.amal.borutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import dev.amal.borutoapp.data.repository.Repository
import dev.amal.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> =
        repository.getAllHeroes()
}
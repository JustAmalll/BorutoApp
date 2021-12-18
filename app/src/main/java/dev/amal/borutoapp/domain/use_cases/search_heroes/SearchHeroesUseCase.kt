package dev.amal.borutoapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import dev.amal.borutoapp.data.repository.Repository
import dev.amal.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> =
        repository.searchHeroes(query = query)
}
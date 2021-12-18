package dev.amal.borutoapp.domain.use_cases.get_selected_hero

import dev.amal.borutoapp.data.repository.Repository
import dev.amal.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero =
        repository.getSelectedHero(heroId = heroId)
}
package dev.amal.borutoapp.domain.use_cases

import dev.amal.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import dev.amal.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import dev.amal.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import dev.amal.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import dev.amal.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUserCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
    val getSelectedHeroUseCase: GetSelectedHeroUseCase
)

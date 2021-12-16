package dev.amal.borutoapp.domain.use_cases

import dev.amal.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import dev.amal.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import dev.amal.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUserCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase
)

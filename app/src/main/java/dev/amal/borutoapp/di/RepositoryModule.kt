package dev.amal.borutoapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.amal.borutoapp.data.repository.DataStoreOperationsImpl
import dev.amal.borutoapp.data.repository.Repository
import dev.amal.borutoapp.domain.repository.DataStoreOperations
import dev.amal.borutoapp.domain.use_cases.UseCases
import dev.amal.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import dev.amal.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import dev.amal.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import dev.amal.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import dev.amal.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations = DataStoreOperationsImpl(context = context)

    @Provides
    @Singleton
    fun provideUserCases(repository: Repository): UseCases =
        UseCases(
            saveOnBoardingUserCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository),
            searchHeroesUseCase = SearchHeroesUseCase(repository),
            getSelectedHeroUseCase = GetSelectedHeroUseCase(repository)
        )
}
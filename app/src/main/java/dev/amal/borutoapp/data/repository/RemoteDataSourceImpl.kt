package dev.amal.borutoapp.data.repository

import androidx.paging.PagingData
import dev.amal.borutoapp.data.local.BorutoDatabase
import dev.amal.borutoapp.data.remote.BorutoApi
import dev.amal.borutoapp.domain.model.Hero
import dev.amal.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow

class RemoteDataSourceImpl(
    private val borutoApi: BorutoApi,
    private val borutoDatabase: BorutoDatabase
): RemoteDataSource {
    override fun getAllData(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }

    override fun searchHeroes(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }
}
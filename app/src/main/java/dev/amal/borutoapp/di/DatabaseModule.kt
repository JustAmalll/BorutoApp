package dev.amal.borutoapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.amal.borutoapp.data.local.BorutoDatabase
import dev.amal.borutoapp.data.repository.LocalDataSourceImpl
import dev.amal.borutoapp.domain.repository.LocalDataSource
import dev.amal.borutoapp.util.Constants.BORUTO_DATABASE
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): BorutoDatabase =
        Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()

    @Provides
    @Singleton
    fun provideLocalDataSource(
        database: BorutoDatabase
    ): LocalDataSource =
        LocalDataSourceImpl(borutoDatabase = database)

}
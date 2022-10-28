package com.worldonetop.lawbenefitbalance.di

import android.content.Context
import androidx.room.Room
import com.worldonetop.lawbenefitbalance.data.local.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DBModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, "kim_ready.db")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    fun provideAgendaDao(appDatabase: AppDatabase): ScheduleDao = appDatabase.agendaDao()
    @Provides
    fun provideBillDao(appDatabase: AppDatabase): BillDao = appDatabase.billDao()
    @Provides
    fun provideConferenceDao(appDatabase: AppDatabase): ConferenceDao = appDatabase.conferenceDao()
    @Provides
    fun provideNewsDao(appDatabase: AppDatabase): NewsDao = appDatabase.newsDao()
}
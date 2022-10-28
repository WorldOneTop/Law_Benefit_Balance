package com.worldonetop.lawbenefitbalance.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.worldonetop.lawbenefitbalance.data.model.Schedule
import com.worldonetop.lawbenefitbalance.data.model.Bill
import com.worldonetop.lawbenefitbalance.data.model.Conference
import com.worldonetop.lawbenefitbalance.data.model.News

@Database(entities = [Schedule::class, Bill::class,Conference::class, News::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun agendaDao(): ScheduleDao
    abstract fun billDao(): BillDao
    abstract fun conferenceDao(): ConferenceDao
    abstract fun newsDao(): NewsDao
}
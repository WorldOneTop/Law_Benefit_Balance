package com.worldonetop.lawbenefitbalance.data.local

import androidx.room.*
import com.worldonetop.lawbenefitbalance.data.model.Schedule

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedule WHERE meetingday BETWEEN :startDate AND :endDate")
    fun loadSchedule(startDate: Long, endDate: Long): Array<Schedule>
    @Query("SELECT * FROM schedule WHERE agendaId = :agenda_id AND content IS NOT NULL")
    fun loadDetailSchedule1(agenda_id:Long): Schedule
    @Query("SELECT * FROM schedule WHERE committeeId = :committee_id AND boardId = :board_id AND recordId = :record_id")
    fun loadDetailSchedule2(committee_id:Long, board_id:Long, record_id:Long): Schedule

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: Schedule)
    @Insert
    fun insertAll(vararg users: Schedule)

    @Delete
    fun delete(user: Schedule)
    @Query("DELETE FROM schedule")
    fun deleteAll()
}
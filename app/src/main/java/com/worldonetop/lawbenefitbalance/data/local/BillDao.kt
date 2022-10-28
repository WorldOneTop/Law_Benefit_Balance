package com.worldonetop.lawbenefitbalance.data.local

import androidx.room.*
import com.worldonetop.lawbenefitbalance.data.model.Bill


@Dao
interface BillDao {
    @Query("SELECT * FROM bill")
    fun loadBill(date:Long): Array<Bill>
    @Query("SELECT * FROM bill")
    fun loadLatestBill(): Array<Bill>
    @Query("SELECT * FROM bill")
    fun loadSave(): Array<Bill>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: Bill)
    @Insert
    fun insertAll(vararg users: Bill)

    @Delete
    fun delete(user: Bill)
    @Query("DELETE FROM bill WHERE save=0")
    fun deleteNoSave()
    @Query("DELETE FROM agenda")
    fun deleteAll()

}
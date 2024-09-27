package com.dnchkw.financetracker.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.dnchkw.financetracker.database.entities.Balance


@Dao
interface BalanceDao {
    @Upsert
    suspend fun upsertBudget(balance: Balance)

    @Delete
    suspend fun deleteBalance(balance: Balance)

    @Query("SELECT * FROM balances")
    suspend fun getAllBalances(): List<Balance>

    @Query("SELECT * FROM balances WHERE :id = balanceId")
    suspend fun getBalanceById(id: Long): Balance
}
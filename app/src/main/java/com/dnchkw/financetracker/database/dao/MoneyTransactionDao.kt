package com.dnchkw.financetracker.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.dnchkw.financetracker.database.entities.MoneyTransaction


@Dao
interface MoneyTransactionDao {
    @Upsert
    suspend fun upsertTransaction(moneyTransactionDao: MoneyTransaction)

    @Query("SELECT * FROM transactions")
    suspend fun getAllTransactions(): List<MoneyTransaction>

    @Query("SELECT * FROM transactions WHERE :id = transactionId")
    suspend fun getTransactionsById(id: Long): MoneyTransaction
}
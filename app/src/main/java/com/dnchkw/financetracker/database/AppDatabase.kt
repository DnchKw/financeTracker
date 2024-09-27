package com.dnchkw.financetracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dnchkw.financetracker.database.dao.BalanceDao
import com.dnchkw.financetracker.database.dao.MoneyTransactionDao
import com.dnchkw.financetracker.database.entities.Balance
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import com.dnchkw.financetracker.database.entities.TransactionBalanceCrossRef

@Database(
    version = 1,
    entities = [
        MoneyTransaction::class,
        Balance::class,
        TransactionBalanceCrossRef::class
    ]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun accountDao(): BalanceDao
    abstract fun moneyTransactionDao(): MoneyTransactionDao
}
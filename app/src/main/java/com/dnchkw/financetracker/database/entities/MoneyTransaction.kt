package com.dnchkw.financetracker.database.entities

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.dnchkw.financetracker.database.AppDatabase
import java.time.LocalDate
import java.time.LocalDateTime


@Entity(tableName = "transactions")
data class MoneyTransaction(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "transactionId")
    val id: Long = 1,
    @ColumnInfo(name = "type")
    val type: String,
    @ColumnInfo(name = "category")
    val category: String,
    @ColumnInfo(name = "sum")
    val sum: Double,
    @ColumnInfo(name = "body")
    val body: String = "",
    @ColumnInfo(name = "date")
    val date: String = LocalDate.now().toString()
)

suspend fun fetchAllTransactions(db: AppDatabase): List<MoneyTransaction> {
    return db.moneyTransactionDao().getAllTransactions()
}

suspend fun fetchTransactionById(db: AppDatabase, id: Long): MoneyTransaction {
    return db.moneyTransactionDao().getTransactionsById(id)
}
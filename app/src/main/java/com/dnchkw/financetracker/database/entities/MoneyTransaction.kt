package com.dnchkw.financetracker.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

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
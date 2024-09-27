package com.dnchkw.financetracker.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dnchkw.financetracker.database.AppDatabase
import kotlinx.coroutines.flow.MutableStateFlow

@Entity(tableName = "balances")
data class Balance(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "balanceId")
    val id: Long = 1,
    @ColumnInfo(name = "balance")
    val balance: Double,
    @ColumnInfo(name = "currency")
    val currency: String = "USD"
)

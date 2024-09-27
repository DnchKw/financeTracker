package com.dnchkw.financetracker.database.entities

import androidx.room.Entity

@Entity(primaryKeys = ["balanceId", "transactionId"])
data class TransactionBalanceCrossRef(
    val balanceId: Long,
    val transactionId: Long
)

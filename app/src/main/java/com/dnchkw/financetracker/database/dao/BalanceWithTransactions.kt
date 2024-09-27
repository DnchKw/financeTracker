package com.dnchkw.financetracker.database.dao

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.dnchkw.financetracker.database.entities.Balance
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import com.dnchkw.financetracker.database.entities.TransactionBalanceCrossRef

class BalanceWithTransactions(
    @Embedded val balance: Balance,
    @Relation(
        parentColumn = "balanceId",
        entityColumn = "transactionId",
        associateBy = Junction(TransactionBalanceCrossRef::class)
    )
    val transactions: List<MoneyTransaction>
)
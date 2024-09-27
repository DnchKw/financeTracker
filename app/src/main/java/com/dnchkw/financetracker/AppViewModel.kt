package com.dnchkw.financetracker

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dnchkw.financetracker.database.AppDatabase
import com.dnchkw.financetracker.database.entities.Balance
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate

class AppViewModel(private val db: AppDatabase) : ViewModel() {
    private var _balance = MutableStateFlow<Balance>(Balance(0, 0.0))
    private var transactions = mutableListOf<MoneyTransaction>()
    private var _transactionsByDate = MutableStateFlow<List<TransactionsByDate>>(
        mutableListOf<TransactionsByDate>()
    )
    private var _isFirstRun = MutableStateFlow(false)
    var isBalanceCreated = true

    val balance = _balance.asStateFlow()
    val transactionsByDate = _transactionsByDate.asStateFlow()

    init {
        viewModelScope.launch {
//            _balance.value = db.accountDao().getBalanceById(1)
            transactions = db.moneyTransactionDao().getAllTransactions().toMutableList()
            setLastTransactionsByDate()
        }
    }

    fun setBalance() {
        viewModelScope.launch {
            _balance.value = db.accountDao().getBalanceById(1)
        }
    }

    fun createBalance(balance: Balance) {
        viewModelScope.launch {
            db.accountDao().upsertBudget(balance)
        }
    }

    fun createNewTransaction(transaction: MoneyTransaction) {
        viewModelScope.launch {
            val lastTransactionIndex =
                this@AppViewModel.db.moneyTransactionDao().getAllTransactions().lastIndex
            val newTransaction = MoneyTransaction(
                id = (lastTransactionIndex + 2).toLong(),
                type = transaction.type,
                sum = transaction.sum,
                category = transaction.category,
                body = transaction.body,
                date = LocalDate.now().toString()
            )

            db.moneyTransactionDao().upsertTransaction(newTransaction)

            val balance = db.accountDao().getBalanceById(1)!!
            transactions.add(newTransaction)
            setLastTransactionsByDate()

            db.accountDao().upsertBudget(
                Balance(
                    id = 1,
                    balance = if (transaction.type == "Income") {
                        balance.balance + transaction.sum
                    } else {
                        balance.balance - transaction.sum
                    },
                    currency = balance.currency
                )
            )
        }
    }

    private fun getTransactionsByDate(): List<TransactionsByDate> {
        return this
            .transactions
            .groupBy { it.date }
            .map { (date, transactions) ->
                TransactionsByDate(date, transactions.reversed())
        }
    }

    fun setTransactionsByDate() {
        _transactionsByDate.value = this
            .transactions
            .groupBy { it.date }
            .map { (date, transactions) ->
                TransactionsByDate(date, transactions.reversed())
            }.reversed()
    }

    fun setLastTransactionsByDate() {
        val lastTransactions = mutableListOf<TransactionsByDate>()
        getTransactionsByDate().reversed().forEachIndexed { index, transactionsByDate ->
            if (index <= 1) {
                lastTransactions.add(transactionsByDate)
            }
        }
        _transactionsByDate.value = lastTransactions
    }
}

data class TransactionsByDate(
    val date: String,
    val transactions: List<MoneyTransaction>
)
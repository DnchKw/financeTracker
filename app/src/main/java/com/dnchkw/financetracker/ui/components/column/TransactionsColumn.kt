package com.dnchkw.financetracker.ui.components.column

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dnchkw.financetracker.TransactionsByDate
import com.dnchkw.financetracker.ui.components.card.TransactionCard
import com.dnchkw.financetracker.ui.screens.isYesterday
import java.time.LocalDate

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TransactionsColumn(
    transactionsList: List<TransactionsByDate>,
    currency: String = "USD"
    ) {
    LazyColumn {
        transactionsList.forEach {
            stickyHeader(it.date) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background),
                    verticalArrangement = Arrangement.Center
                ) {
                    if (it.date == LocalDate.now().toString()) {
                        Text("Today", fontSize = 19.sp)
                    } else if (isYesterday(it.date)) {
                        Text("Yesterday", fontSize = 19.sp)
                    } else {
                        Text(it.date, fontSize = 19.sp)
                    }
                    Spacer(Modifier.height(8.dp))
                }
            }
            items(it.transactions) {
                TransactionCard(it, currency)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}
package com.dnchkw.financetracker.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dnchkw.financetracker.AppViewModel
import com.dnchkw.financetracker.database.AppDatabase
import com.dnchkw.financetracker.database.entities.Balance
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import com.dnchkw.financetracker.ui.components.card.TransactionCard
import com.dnchkw.financetracker.ui.components.column.TransactionsColumn
import com.dnchkw.financetracker.ui.components.icons.Filter_list
import com.dnchkw.financetracker.ui.navigation.Destinations
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.time.LocalDate

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun AllTransactions(
    viewModel: AppViewModel,
    navController: NavController
    ) {
    val currency = remember {
        viewModel.balance.value.currency
    }
    val transactionsListState = viewModel.transactionsByDate
    viewModel.setTransactionsByDate()
    Scaffold {
        Column(Modifier.padding(it).padding(horizontal = 12.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
                ) {
                IconButton(onClick = {
                    navController.navigate(Destinations.Main.route)
                }) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        "Back",
                        Modifier.size(26.dp)
                    )
                }
                Text(
                    "All transactions",
                    fontSize = 26.sp
                )
                IconButton(onClick = {}) {
                    Icon(
                        Filter_list,
                        "Filter",
                        Modifier.size(26.dp)
                    )
                }
            }
            Spacer(Modifier.height(15.dp))
            TransactionsColumn(transactionsListState.value, currency)
        }
    }
}
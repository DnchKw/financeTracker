package com.dnchkw.financetracker.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.dnchkw.financetracker.AppViewModel
import com.dnchkw.financetracker.textUtils.isWholeNumber
import com.dnchkw.financetracker.ui.components.column.TransactionsColumn
import com.dnchkw.financetracker.ui.components.icons.ArrowDownRight
import com.dnchkw.financetracker.ui.components.icons.ArrowUpRight
import com.dnchkw.financetracker.ui.components.icons.getCurrencyIcon
import com.dnchkw.financetracker.ui.navigation.Destinations
import java.time.LocalDate


@Composable
fun MainScreen(
    viewModel: AppViewModel,
    navController: NavController
) {
    val balanceState = viewModel.balance.collectAsStateWithLifecycle()
    val transactionsListState = viewModel.transactionsByDate.collectAsStateWithLifecycle()
    viewModel.setLastTransactionsByDate()
    Scaffold { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
            ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(horizontal = 12.dp)
            ) {
                Spacer(Modifier.height(12.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(12.dp),
                    shape = MaterialTheme.shapes.extraLarge
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth().padding(
                            vertical = 25.dp,
                            horizontal = 10.dp
                        )
                        ) {
                        Icon(
                            getCurrencyIcon(balanceState.value.currency),
                            balanceState.value.currency,
                            Modifier.size(24.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = if (isWholeNumber(balanceState.value.balance)) {
                                balanceState.value.balance.toInt().toString()
                            } else {
                                balanceState.value.balance.toString()
                            },
                            fontSize = 24.sp,
                            color = if (balanceState.value.balance < 0) {
                                MaterialTheme.colorScheme.error
                            } else {
                                Color.Unspecified
                            }
                        )
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(5.dp),
                            contentAlignment = Alignment.CenterEnd
                            ) {
                            Text(
                                balanceState.value.currency,
                                color = MaterialTheme.colorScheme.secondary,
                                fontSize = 18.sp
                                )
                        }
                    }

                }
                Spacer(Modifier.height(7.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(onClick = {
                        navController.navigate(Destinations.AddIncome.route)
                    }) {
                        Icon(
                            ArrowDownRight,
                            "Income",
                            tint = Color(0xff4caf50),
                            modifier = Modifier.size(26.dp)
                        )
                        Spacer(Modifier.width(5.dp))
                        Text(
                            "Income",
                            fontSize = 20.sp
                            )
                    }
                    Button(onClick = {
                        navController.navigate(Destinations.AddExpense.route)
                    }) {
                        Icon(
                            ArrowUpRight,
                            "Expense",
                            tint = Color(0xffff66b2),
                            modifier = Modifier.size(26.dp)
                        )
                        Spacer(Modifier.width(5.dp))
                        Text(
                            "Expense",
                            fontSize = 20.sp
                            )
                    }
                }
                Spacer(Modifier.height(7.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Last transactions",
                        fontSize = 26.sp
                    )
                    TextButton(onClick = {
                        navController.navigate(Destinations.AllTransactions.route)
                    }) {
                        Text(
                            "View all",
                            fontSize = 20.sp,
                            color = MaterialTheme.colorScheme.secondary
                            )
                    }
                }
                TransactionsColumn(transactionsListState.value, balanceState.value.currency)
            }
        }
    }
}


fun isYesterday(date: String): Boolean {
    return date == LocalDate.now().minusDays(1).toString()
}

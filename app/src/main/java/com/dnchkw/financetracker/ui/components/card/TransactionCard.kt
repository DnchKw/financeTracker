package com.dnchkw.financetracker.ui.components.card


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.dnchkw.financetracker.textUtils.isWholeNumber
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import com.dnchkw.financetracker.textUtils.formatText
import com.dnchkw.financetracker.ui.components.icons.getCategoryIcon
import com.dnchkw.financetracker.ui.components.icons.getCurrencyIcon


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransactionCard(transaction: MoneyTransaction, currency: String, modifier: Modifier = Modifier) {
    var showDialog by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { showDialog = !showDialog }
    ) {
        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                colors = CardColors(
                    containerColor = MaterialTheme.colorScheme.inverseSurface,
                    contentColor = MaterialTheme.colorScheme.surface,
                    disabledContainerColor = MaterialTheme.colorScheme.inversePrimary,
                    disabledContentColor = MaterialTheme.colorScheme.inversePrimary
                )
            ) {
                Box(Modifier.padding(8.dp)) {
                    Icon(
                        getCategoryIcon(transaction.category),
                        transaction.category,
                        Modifier.size(26.dp)
                    )
                }
            }
            Spacer(Modifier.width(10.dp))
            if (transaction.body == "") {
                Text(
                    transaction.category,
                    fontSize = 18.sp
                )
            } else {
                Column {
                    Text(
                        transaction.category,
                        fontSize = 18.sp
                    )
                    Text(
                        transaction.body.formatText(15),
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 16.sp,
                        maxLines = 1
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
            ) {
                Icon(
                    getCurrencyIcon(currency),
                    currency,
                    Modifier.size(24.dp)
                )
                Text(
                    text = if (isWholeNumber(transaction.sum)) {
                        transaction.sum.toInt().toString()
                    } else {
                        transaction.sum.toString()
                    },
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

    if (showDialog) {
        Dialog(onDismissRequest = { showDialog = false }) {
            Card {
                Column(
                    Modifier.padding(7.dp)
                    ) {
                    Text("Transaction info", fontSize = 24.sp)
                    Spacer(Modifier.height(5.dp))
                    Text("Type: ${transaction.type}")
                    if (transaction.type != "Income")
                        Text("Category: ${transaction.category}")
                    Text("Amount: ${
                        if (isWholeNumber(transaction.sum)) {
                            transaction.sum.toInt().toString()
                        } else {
                            transaction.sum.toString()
                        }
                    } $currency")
                    if (transaction.body != "")
                        Text("Description: ${transaction.body}")
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    Surface {
        Scaffold {
            Box(Modifier.padding(it).padding(horizontal = 12.dp)) {
                TransactionCard(
                    MoneyTransaction(
                        1,
                        "Expense",
                        "Food",
                        15.0,
                        "очень вкусный бургер просто объедение"
                    ),
                    "EUR"
                    )
            }
        }
    }
}
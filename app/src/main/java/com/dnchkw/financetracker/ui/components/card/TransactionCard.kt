package com.dnchkw.financetracker.ui.components.card


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dnchkw.financetracker.textUtils.isWholeNumber
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import com.dnchkw.financetracker.ui.components.icons.getCategoryIcon
import com.dnchkw.financetracker.ui.components.icons.getCurrencyIcon

@Composable
fun TransactionCard(transaction: MoneyTransaction, currency: String, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.fillMaxWidth(),
//        colors = CardColors(
//            containerColor = Color.Unspecified,
//            contentColor = Color.Unspecified,
//            disabledContainerColor = Color.Unspecified,
//            disabledContentColor = Color.Unspecified
//        )
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
                    if (transaction.body.length <= 20) {
                        Text(
                            transaction.body,
                            color = MaterialTheme.colorScheme.secondary,
                            fontSize = 16.sp
                        )
                    } else {
                        Text(
                            transaction.body.slice(0..16) + "...",
                            color = MaterialTheme.colorScheme.secondary,
                            fontSize = 16.sp
                        )
                    }
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
//                    Spacer(Modifier.width(4.dp))
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
                        ""
                    ),
                    "EUR"
                    )
            }
        }
    }
}
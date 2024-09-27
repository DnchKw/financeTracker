package com.dnchkw.financetracker.ui.components.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

fun getCurrencyIcon(currency: String): ImageVector {
    return when(currency) {
        "USD" -> CurrencyDollar
        "RUB" -> Currency_ruble
        "EUR" -> Euro_symbol
        else -> Icons.Filled.Warning
    }
}

val listOfCurrency = listOf(
    "USD",
    "RUB",
    "EUR"
    )

package com.dnchkw.financetracker.ui.components.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

public val categoryList = listOf(
    "Food",
    "House",
    "Transport",
    "Medicine",
    "Shopping",
    "Entertainment",
    "Education",
    "Communication",
    "Personal",
    "Gifts",
    "Financial"
)

fun getCategoryIcon(category: String): ImageVector {
    return when(category) {
        categoryList[0] -> Local_dining
        categoryList[1] -> Icons.Outlined.Home
        categoryList[2] -> Commute
        categoryList[3] -> Heart_check
        categoryList[4] -> Shopping_bag
        categoryList[5] -> Videogame_asset
        categoryList[6] -> Book_2
        categoryList[7] -> Wifi
        categoryList[8] -> Person
        categoryList[9] -> Gift
        categoryList[10] -> CashCoin
        "Income" -> ArrowDownRight
        else -> Icons.Filled.Warning
    }
}
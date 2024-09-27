package com.dnchkw.financetracker.ui.navigation

sealed class Destinations(val route: String) {
    data object Main : Destinations("main")
    data object Welcome : Destinations("welcome")
    data object CreateBalance : Destinations("create balance")
    data object AddExpense : Destinations("add expense")
    data object AddIncome : Destinations("add income")
    data object AllTransactions : Destinations("all transactions")
    data object Settings : Destinations("settings")
}
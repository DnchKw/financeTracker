package com.dnchkw.financetracker

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.dnchkw.financetracker.database.AppDatabase
import com.dnchkw.financetracker.ui.navigation.Destinations
import com.dnchkw.financetracker.ui.screens.AddExpense
import com.dnchkw.financetracker.ui.screens.AddIncome
import com.dnchkw.financetracker.ui.screens.AllTransactions
import com.dnchkw.financetracker.ui.screens.AppInfo
import com.dnchkw.financetracker.ui.screens.CreateBalance
import com.dnchkw.financetracker.ui.screens.MainScreen
import com.dnchkw.financetracker.ui.theme.BackgroundColor
import com.dnchkw.financetracker.ui.theme.FinanceTrackerTheme


@Suppress("UNCHECKED_CAST")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val db = Room.databaseBuilder(
            context = applicationContext,
            klass = AppDatabase::class.java,
            name = "finance-database"
        ).build()
        val context = this
        setContent {
            val navController = rememberNavController()
            val viewModel = viewModel<AppViewModel>(
                factory = object : ViewModelProvider.Factory {
                    override fun <T : ViewModel> create(modelClass: Class<T>): T {
                        return AppViewModel(db) as T
                    }
                }
            )
            val isFirstRun = isFirstRun(context)
            FinanceTrackerTheme {
                Surface(
                    color =
                        MaterialTheme.colorScheme.surface
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = if (isFirstRun) {
                            Destinations.Welcome.route
                        } else {
                            Destinations.Main.route
                        }
                    ) {
                        composable(route = Destinations.Main.route) {
                            if (!isFirstRun(context)) {
                                viewModel.setBalance()
                            }
                            MainScreen(viewModel, navController)
                        }
                        composable(route = Destinations.Welcome.route) {
                            AppInfo(navController)
                        }
                        composable(route = Destinations.CreateBalance.route) {
                            CreateBalance(viewModel, navController)
                        }
                        composable(route = Destinations.AddExpense.route) {
                            AddExpense(viewModel, navController)
                        }
                        composable(route = Destinations.AddIncome.route) {
                            AddIncome(viewModel, navController)
                        }
                        composable(route = Destinations.AllTransactions.route) {
                            AllTransactions(viewModel, navController)
                        }
                    }
                }
            }
        }
    }

    @SuppressLint("SuspiciousIndentation")
    private fun isFirstRun(context: Context): Boolean {
        val sharedPreferences = context.getSharedPreferences(
            "app_preferences",
            Context.MODE_PRIVATE
        )
        val isFirstRun = sharedPreferences.getBoolean("is_first_run", true)

        if (isFirstRun) {
            sharedPreferences.edit().putBoolean("is_first_run", false).apply()
        }

		return isFirstRun
//        viewModel.isBalanceCreated()
//        val isBalanceCreated = viewModel.isBalanceCreated
//
//        if (isBalanceCreated) {
//            viewModel.setBalance()
//        }
//
//        return !isBalanceCreated
    }
}


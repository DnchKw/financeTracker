package com.dnchkw.financetracker.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dnchkw.financetracker.AppViewModel
import com.dnchkw.financetracker.database.AppDatabase
import com.dnchkw.financetracker.database.entities.Balance
import com.dnchkw.financetracker.ui.components.icons.getCurrencyIcon
import com.dnchkw.financetracker.ui.components.icons.listOfCurrency
import com.dnchkw.financetracker.ui.navigation.Destinations
import com.dnchkw.financetracker.ui.theme.TextColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateBalance(
    viewModel: AppViewModel,
    navController: NavController
    ) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
        ) {
        var balance by remember {
            mutableStateOf("")
        }
        var balanceLabel by remember {
            mutableStateOf("Your balance")
        }
        var balanceError by remember {
            mutableStateOf(false)
        }
        var expanded by remember {
            mutableStateOf(false)
        }
        var currency by remember {
            mutableStateOf("USD")
        }
        Text(
            "Create a balance",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(
            value = balance,
            onValueChange = {
                balance = if (it[it.lastIndex] == ',') {
                    balance
                } else if (balance.contains('.') && it[it.lastIndex] == '.') {
                    balance
                } else {
                    it
                }
                balanceError = balance.contains('-')
                balanceLabel = if (balanceError) {
                    "Value can't be negative"
                } else {
                    "Your balance"
                }
            },
            label = {
                Text(
                    balanceLabel,
                    fontSize = 20.sp
                )
            },
            placeholder = {
                Text(
                    text = "0",
                    fontSize = 20.sp
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            singleLine = true,
            isError = balanceError,
            leadingIcon = {
                Icon(
                    imageVector = getCurrencyIcon(currency),
                    contentDescription = currency,
                    modifier = Modifier.size(20.dp)
                )
            },
            textStyle = LocalTextStyle.current.copy(
                fontSize = 20.sp
            ),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = MaterialTheme.colorScheme.secondary
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
            ) {
            OutlinedTextField(
                value = currency,
                onValueChange = {},
                singleLine = true,
                readOnly = true,
                modifier = Modifier.menuAnchor(),
                leadingIcon = {
                    Icon(
                        imageVector = getCurrencyIcon(currency),
                        contentDescription = currency,
                        modifier = Modifier.size(20.dp)
                    )
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults
                        .TrailingIcon(expanded = expanded)
                },
                textStyle = LocalTextStyle.current.copy(
                    fontSize = 20.sp
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = MaterialTheme.colorScheme.secondary,
                    focusedLabelColor = MaterialTheme.colorScheme.surface,
                ),
                )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                listOfCurrency.forEach {
                    DropdownMenuItem(
                        text = {
                            Text(text = it)
                        },
                        onClick = {
                            currency = it
                            expanded = false
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = getCurrencyIcon(it),
                                contentDescription = it,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = {
                val sum = balance
                    .replace(" ", "")
                    .toDouble()
                viewModel.createBalance(
                    Balance(
                        id = 1,
                        balance = sum,
                        currency = currency
                    )
                )
                navController.navigate(Destinations.Main.route)
//                viewModel.setBalance()
            },
            enabled = !balanceError && balance != ""
        ) {
            Text(
                text = "Finish",
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
        }
    }
}


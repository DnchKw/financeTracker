package com.dnchkw.financetracker.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dnchkw.financetracker.AppViewModel
import com.dnchkw.financetracker.database.entities.MoneyTransaction
import com.dnchkw.financetracker.ui.components.icons.categoryList
import com.dnchkw.financetracker.ui.components.icons.getCategoryIcon
import com.dnchkw.financetracker.ui.components.icons.getCurrencyIcon
import com.dnchkw.financetracker.ui.navigation.Destinations
import java.time.LocalDate

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddExpense(
    viewModel: AppViewModel,
    navController: NavController
    ) {
    val currency = remember {
        viewModel.balance.value.currency
    }
    var amountValue by remember {
        mutableStateOf("")
    }
    var descriptionValue by remember {
        mutableStateOf("")
    }
    var category by remember {
        mutableStateOf("Food")
    }
    var expanded by remember {
        mutableStateOf(false)
    }

    Scaffold { padding ->
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(padding)
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
                "Add Expense",
                fontSize = 26.sp
            )
            IconButton(onClick = {}) {
//              Cap
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        OutlinedTextField(
            value = amountValue,
            onValueChange = {
                amountValue = if (it[it.lastIndex] == ',') {
                    amountValue
                } else if (amountValue.contains('.') && it[it.lastIndex] == '.') {
                    amountValue
                } else {
                    it
                }
            },
            label = {
                Text(
                    "Amount",
                    fontSize = 18.sp
                    )
            },
            placeholder = {
                Text(
                    text = "0",
                    fontSize = 18.sp
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(
                fontSize = 18.sp
            ),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = MaterialTheme.colorScheme.secondary
            ),
            leadingIcon = {
                Icon(
                    imageVector = getCurrencyIcon(currency),
                    contentDescription = currency,
                    modifier = Modifier.size(28.dp)
                )
            }
        )
        Spacer(Modifier.height(10.dp))
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            Card {
                OutlinedTextField(
                    value = category,
                    readOnly = true,
                    onValueChange = {},
                    modifier = Modifier.menuAnchor(),
                    singleLine = true,
                    leadingIcon = {
                        Icon(
                            getCategoryIcon(category),
                            category,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    trailingIcon = {
                        ExposedDropdownMenuDefaults
                            .TrailingIcon(expanded = expanded)
                    },
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 18.sp
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Transparent,
                        focusedBorderColor = Color.Transparent,
                        focusedLabelColor = Color.Transparent,
                    ),
                )
            }
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                categoryList.forEach {
                    DropdownMenuItem(
                        text = {
                            Text(text = it)
                        },
                        onClick = {
                            category = it
                            expanded = false
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = getCategoryIcon(it),
                                contentDescription = it,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    )
                }
            }
        }
        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = descriptionValue,
            onValueChange = { descriptionValue = it },
            label = {
                Text("Description", fontSize = 18.sp)
            },
            textStyle = LocalTextStyle.current.copy(
                fontSize = 18.sp
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            )
        )
        Spacer(Modifier.height(70.dp))
        Button(
            onClick = {
                viewModel.createNewTransaction(
                    MoneyTransaction(
                        type = "Expense",
                        sum = amountValue.toDouble(),
                        category = category,
                        body = descriptionValue,
                        date = LocalDate.now().toString()
                    )
                )
                navController.navigate(Destinations.Main.route)
            },
            enabled = amountValue != ""
        ) {
            Text("Done", fontSize = 20.sp)
        }
    }
}
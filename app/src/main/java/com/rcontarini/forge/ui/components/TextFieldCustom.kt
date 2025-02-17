package com.rcontarini.forge.ui.components

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TextFieldCustom(
    modifier: Modifier = Modifier,
    value: String,
    hintValue: String,
    onValueChange: (String) -> Unit?
) {

    TextField(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.background),
        onValueChange = { newValue ->
            onValueChange.invoke(newValue)
        },
        label = {
            Text(
                text = hintValue,
                style = MaterialTheme.typography.titleMedium
            )
        },
        value = value,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.background,
            unfocusedContainerColor = MaterialTheme.colorScheme.background,
            disabledContainerColor = MaterialTheme.colorScheme.background,
        )
    )
}
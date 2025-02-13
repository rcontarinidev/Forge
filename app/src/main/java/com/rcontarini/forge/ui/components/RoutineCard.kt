package com.rcontarini.forge.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun RoutineCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    titleButton: String,
    actionButton: () -> Unit
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
            disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
            disabledContainerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
            contentColor = MaterialTheme.colorScheme.primary
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = Spacing.ExtraSmall
        )
        ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Spacing.Large)
                .align(
                    alignment = Alignment.CenterHorizontally
                )
        ) {
            Text(
                modifier = Modifier,
                text = title,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                modifier = Modifier.padding(
                    top = Spacing.Small
                ),
                text = description,
                style = MaterialTheme.typography.bodyMedium
            )
            PrimaryButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = Spacing.Large),
                title = titleButton,
                actionButton = actionButton
            )
        }
    }
}
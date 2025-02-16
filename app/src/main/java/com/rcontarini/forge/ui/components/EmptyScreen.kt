package com.rcontarini.forge.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun EmptyScreen(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    description: String,
    contentDescription: String
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            modifier = Modifier
                .padding(Spacing.ExtraLarge)
                .size(Spacing.XXLarge),
            imageVector = icon,
            tint = Color.Gray,
            contentDescription = contentDescription
        )

        Text(
            modifier = Modifier
                .padding(
                    top = Spacing.Small,
                    start = Spacing.ExtraLarge,
                    end = Spacing.ExtraLarge
                ),
            textAlign = TextAlign.Center,
            text = description,
            style = MaterialTheme.typography.titleLarge
        )
    }

}
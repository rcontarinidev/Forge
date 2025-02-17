package com.rcontarini.forge.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    title: String,
    actionButton: () -> Unit,
    icon: ImageVector? = null,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.background,
) {

    Button(
        modifier = modifier,
        onClick = actionButton,
        enabled = true,
        colors = ButtonColors(
            containerColor = backgroundColor,
            contentColor = contentColor,
            disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
            disabledContainerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        ),
        shape = RoundedCornerShape(Spacing.Medium)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            if (icon != null) {
                Icon(
                    modifier = Modifier
                        .size(Spacing.ExtraLarge)
                        .padding(end = Spacing.Medium),
                    imageVector = icon,
                    contentDescription = "",
                    tint = contentColor
                )
            }
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }

}
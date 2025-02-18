package com.rcontarini.forge.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.rcontarini.forge.domain.ExerciseModel
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun ExerciseCard(
    modifier: Modifier = Modifier,
    exerciseModel: ExerciseModel,
    isSelected: Boolean,
    onExerciseSelected: () -> Unit
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(
            defaultElevation = Spacing.ExtraSmall
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(Spacing.Small),
        onClick = onExerciseSelected
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(Spacing.XXMassive),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(Spacing.Small)
                    .fillMaxHeight()
                    .background(if (isSelected) MaterialTheme.colorScheme.primary else Color.White)
            )

            Image(
                modifier = Modifier
                    .size(Spacing.Huge)
                    .padding(
                        start = Spacing.Small
                    ),
                imageVector = Icons.Default.AccountBox,
                contentDescription = ""
            )

            Column(
                modifier = Modifier
                    .padding(start = Spacing.Medium)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    modifier = Modifier,
                    text = exerciseModel.title,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    modifier = Modifier
                        .padding(top = Spacing.Small),
                    text = exerciseModel.typeExercise.title,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }

}
package com.rcontarini.forge.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.domain.ExerciseModel
import com.rcontarini.forge.domain.RoutineModel
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun ExerciseList(
    modifier: Modifier = Modifier,
    exerciseList: List<ExerciseModel> = arrayListOf(),
    exerciseClicked: (ExerciseModel) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        itemsIndexed(exerciseList) { _, item ->
            ExerciseCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = Spacing.Large),
                onExerciseSelected = { /* not implemented yet */},
                exerciseModel = item,
                isSelected = false
            )
        }
    }
}
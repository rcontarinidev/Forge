package com.rcontarini.forge.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.domain.RoutineModel
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun RoutineList(
    modifier: Modifier = Modifier,
    routineList: List<RoutineModel> = arrayListOf(),
    routineClicked: (RoutineModel) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        itemsIndexed(routineList) { _, item ->
            RoutineCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = Spacing.Large
                    ),
                title = item.title,
                description = item.description,
                titleButton = stringResource(R.string.home_screen_start_routine_button),
                actionButton = {
                    routineClicked(item)
                }
            )
        }
    }
}
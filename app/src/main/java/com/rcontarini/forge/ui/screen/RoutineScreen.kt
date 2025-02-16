package com.rcontarini.forge.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.ui.components.EmptyScreen
import com.rcontarini.forge.ui.components.ForgeTopAppBar
import com.rcontarini.forge.ui.components.PrimaryButton
import com.rcontarini.forge.ui.components.TextFieldCustom
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun RoutineScreen(
    modifier: Modifier = Modifier,
    onBackPressed: () -> Unit,
    addExerciseClicked: () -> Unit
) {
    val routineTitle = remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier,
        topBar = {
            ForgeTopAppBar(
                modifier = Modifier,
                title = stringResource(R.string.routine_screen_top_bar_title),
                onButtonActionClicked = {},
                onBackPressed = {
                    onBackPressed.invoke()
                },
            )
        },

        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {

                TextFieldCustom(
                    onValueChange = {

                    },
                    value = routineTitle.value,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = Spacing.Large,
                            start = Spacing.Large,
                            end = Spacing.Large
                        ),
                    hintValue = stringResource(R.string.routine_screen_text_title),
                )

                EmptyScreen(
                    modifier = Modifier.padding(
                        Spacing.ExtraLarge
                    ),
                    icon = Icons.Default.Notifications,
                    description = stringResource(R.string.routine_screen_empty_message),
                    contentDescription = stringResource(R.string.routine_screen_icon_content_description)
                )

                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = Spacing.Large,
                            start = Spacing.Large,
                            end = Spacing.Large
                        ),
                    actionButton = {
                        addExerciseClicked.invoke()
                    },
                    icon = Icons.Default.Add,
                    title = stringResource(R.string.routine_screen_button_add_exercise_title)
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier,
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.primary,
                content = {
                    Icon(
                        modifier = Modifier,
                        imageVector = Icons.Default.Check,
                        contentDescription = ""
                    )
                },
                onClick = {

                },
            )
        }
    )
}



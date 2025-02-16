package com.rcontarini.forge.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rcontarini.forge.ui.components.ForgeTopAppBar

@Composable
fun ExerciseScreen(
    modifier: Modifier = Modifier,
    onBackPressed: () -> Unit
) {

    Scaffold(
        modifier = modifier,
        topBar = {
            ForgeTopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = "Add Exercise",
                onButtonActionClicked = {

                },
                onBackPressed = {
                    onBackPressed.invoke()
                }
            )
        },
        content = { innerPadding ->

            Column(
                modifier = Modifier
                    .padding(innerPadding)
            ) {  }

        }
    )
}
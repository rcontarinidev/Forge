package com.rcontarini.forge.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.ui.components.ForgeTopAppBar

@Composable
fun RoutineScreen(
    modifier: Modifier = Modifier,
    onBackPressed: () -> Unit
) {
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
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

        }
    }
}
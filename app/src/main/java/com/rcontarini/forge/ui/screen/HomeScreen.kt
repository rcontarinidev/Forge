package com.rcontarini.forge.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.ui.components.ForgeTopAppBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        ForgeTopAppBar(
            title = stringResource(R.string.home_screen_top_bar_title),
            onButtonActionClicked = {
                /* nothing yet */
            },
            onBackPressed = {
                /* nothing yet */
            }
        )
    }
}
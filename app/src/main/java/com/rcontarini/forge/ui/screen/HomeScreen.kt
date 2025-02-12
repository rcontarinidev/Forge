package com.rcontarini.forge.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.ui.components.ForgeTopAppBar
import com.rcontarini.forge.ui.components.PrimaryButton
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            ForgeTopAppBar(
                modifier = Modifier,
                title = stringResource(R.string.home_screen_top_bar_title),
                onButtonActionClicked = {

                },
                onBackPressed = {

                }
            )
        },

        ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            Text(
                modifier = Modifier.padding(
                    top = Spacing.ExtraLarge,
                    start = Spacing.Large
                ),
                text = stringResource(
                    R.string.home_screen_quick_start
                ),
                style = MaterialTheme.typography.titleLarge
            )

            PrimaryButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        Spacing.Large
                    ),
                title = stringResource(R.string.home_screen_start_empty_training),
                actionButton = {
                    /*
                    not implemented yet
                     */
                }
            )
        }
    }

}
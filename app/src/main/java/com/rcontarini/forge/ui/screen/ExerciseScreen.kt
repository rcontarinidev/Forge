package com.rcontarini.forge.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.rcontarini.forge.R
import com.rcontarini.forge.domain.ExerciseModel
import com.rcontarini.forge.domain.ExercisesSerieModel
import com.rcontarini.forge.domain.StatusEnum
import com.rcontarini.forge.domain.TypeExerciseModel
import com.rcontarini.forge.ui.components.ExerciseList
import com.rcontarini.forge.ui.components.ForgeTopAppBar
import com.rcontarini.forge.ui.components.SimpleSearchField
import com.rcontarini.forge.ui.theme.Spacing

@Composable
fun ExerciseScreen(
    modifier: Modifier = Modifier,
    onBackPressed: () -> Unit
) {

    val fakeExerciseList = listOf(
        ExerciseModel(
            id = 1,
            title = "Supino Reto",
            description = "Exercício para peitoral com barra.",
            typeExercise = TypeExerciseModel("Força", "Força A"),
            url = "https://exemplo.com/supino.jpg",
            creationDate = "2024-02-17",
            listExercisesSerie = listOf(
                ExercisesSerieModel(ExerciseModel(1, "Supino", "", TypeExerciseModel("Força", "Força A"), "", "", listOf(), StatusEnum.COMPLETED), 3, 50, 10, StatusEnum.COMPLETED),
                ExercisesSerieModel(ExerciseModel(1, "Supino", "", TypeExerciseModel("Força", "Força A"), "", "", listOf(), StatusEnum.COMPLETED), 3, 60, 8, StatusEnum.COMPLETED)
            ),
            status = StatusEnum.COMPLETED
        ),
        ExerciseModel(
            id = 2,
            title = "Agachamento Livre",
            description = "Exercício para pernas e glúteos.",
            typeExercise = TypeExerciseModel("Força","Força A"),
            url = "https://exemplo.com/agachamento.jpg",
            creationDate = "2024-02-17",
            listExercisesSerie = listOf(
                ExercisesSerieModel(ExerciseModel(2, "Agachamento", "", TypeExerciseModel("Força", "Força A"), "", "", listOf(), StatusEnum.COMPLETED), 4, 80, 12, StatusEnum.COMPLETED)
            ),
            status = StatusEnum.COMPLETED
        ),
        ExerciseModel(
            id = 3,
            title = "Rosca Direta",
            description = "Exercício para bíceps com halteres.",
            typeExercise = TypeExerciseModel("Hipertrofia","Força A"),
            url = "https://exemplo.com/rosca.jpg",
            creationDate = "2024-02-17",
            listExercisesSerie = listOf(
                ExercisesSerieModel(ExerciseModel(3, "Rosca Direta", "", TypeExerciseModel("Hipertrofia", "Força A"), "", "", listOf(), StatusEnum.COMPLETED), 3, 15, 12, StatusEnum.COMPLETED)
            ),
            status = StatusEnum.COMPLETED
        ),
        ExerciseModel(
            id = 4,
            title = "Prancha",
            description = "Exercício para core e resistência.",
            typeExercise = TypeExerciseModel("Resistência", "Força A"),
            url = "https://exemplo.com/prancha.jpg",
            creationDate = "2024-02-17",
            listExercisesSerie = listOf(
                ExercisesSerieModel(ExerciseModel(4, "Prancha", "", TypeExerciseModel("Resistência", "Força A"), "", "", listOf(), StatusEnum.COMPLETED), 3, 0, 60, StatusEnum.COMPLETED)
            ),
            status = StatusEnum.COMPLETED
        ),
        ExerciseModel(
            id = 5,
            title = "Remada Curvada",
            description = "Exercício para costas e ombros.",
            typeExercise = TypeExerciseModel("Força", "Força A"),
            url = "https://exemplo.com/remada.jpg",
            creationDate = "2024-02-17",
            listExercisesSerie = listOf(
                ExercisesSerieModel(ExerciseModel(5, "Remada Curvada", "", TypeExerciseModel("Força", "Força A"), "", "", listOf(), StatusEnum.COMPLETED), 4, 70, 10, StatusEnum.COMPLETED )
            ),
            status = StatusEnum.COMPLETED
        )
    )


    var searchText = remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier,
        topBar = {
            ForgeTopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = stringResource(R.string.exercise_screen_top_bar_title),
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
            ) {
                SimpleSearchField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = Spacing.Large,
                            start = Spacing.Medium,
                            end = Spacing.Medium
                        ),
                    onQueryChange = {
                        searchText.value = it
                    },
                    query = searchText.value
                )

                Text(
                    modifier = Modifier.padding(
                        top = Spacing.ExtraLarge,
                        start = Spacing.Large
                    ),
                    text = stringResource(
                        R.string.exercise_screen_text_all_exercises
                    ),
                    style = MaterialTheme.typography.bodyLarge
                )

                ExerciseList(
                  modifier = Modifier.padding(top = Spacing.Large),
                    exerciseClicked = {

                    },
                    exerciseList = fakeExerciseList
                )
            }

        }
    )
}
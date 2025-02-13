package com.rcontarini.forge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rcontarini.forge.domain.RoutineModel
import com.rcontarini.forge.ui.screen.HomeScreen
import com.rcontarini.forge.ui.theme.ForgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val routineModelTesteOne = RoutineModel(
            title = "Rotina 1 Teste",
            description = "Exercicio 1, Exercicio 2,, Exercicio 3 ...."
        )

        val routineModelTesteTwo = RoutineModel(
            title = "Rotina 2 Teste",
            description = "Exercicio 1, Exercicio 2,, Exercicio 3 ...."
        )

        val routineModelTesteThree = RoutineModel(
            title = "Rotina 3 Teste",
            description = "Exercicio 1, Exercicio 2,, Exercicio 3 ...."
        )

        val listRoutine = arrayListOf(
            routineModelTesteOne,
            routineModelTesteTwo,
            routineModelTesteThree
        )

        setContent {
            ForgeTheme {
                HomeScreen(
                    modifier = Modifier,
                    listRoutine = listRoutine
                )
            }
        }
    }
}

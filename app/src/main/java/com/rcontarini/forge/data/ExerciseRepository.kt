package com.rcontarini.forge.data

import com.rcontarini.forge.domain.ExerciseModel

interface ExerciseRepository {
    suspend fun getExercises(): List<ExerciseModel>
}
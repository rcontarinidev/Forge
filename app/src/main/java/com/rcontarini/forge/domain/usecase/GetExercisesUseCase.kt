package com.rcontarini.forge.domain.usecase

import com.rcontarini.forge.data.ExerciseRepositoryImpl
import com.rcontarini.forge.domain.ExerciseModel

class GetExercisesUseCase(
    private val exerciseRepositoryImpl: ExerciseRepositoryImpl
) {
    suspend operator fun invoke(): List<ExerciseModel> {
        return exerciseRepositoryImpl.getExercises()
    }
}
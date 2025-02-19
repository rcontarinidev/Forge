package com.rcontarini.forge.domain.usecase

import com.rcontarini.forge.data.RoutineRepositoryImpl
import com.rcontarini.forge.domain.RoutineModel

class GetRoutinesUseCase(
    private val routineRepositoryImpl: RoutineRepositoryImpl
) {
    suspend operator fun invoke(): List<RoutineModel> {
        return routineRepositoryImpl.getRoutines()
    }
}
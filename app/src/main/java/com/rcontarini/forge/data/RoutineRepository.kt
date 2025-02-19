package com.rcontarini.forge.data

import com.rcontarini.forge.domain.RoutineModel

interface RoutineRepository {
    suspend fun getRoutines(): List<RoutineModel>

    suspend fun createRoutine(routineModel: RoutineModel)

    suspend fun deleteRoutine(routineModel: RoutineModel)

    suspend fun updatedRoutine(routineModel: RoutineModel)
}
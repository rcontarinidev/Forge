package com.rcontarini.forge.domain

import kotlinx.serialization.Serializable

@Serializable
class ExercisesSerieModel(
    val exerciseModel: ExerciseModel,
    val numberOfSerie: Int,
    val kilogram: Int,
    val numberOfRepetitions: Int,
    val status: StatusEnum
)
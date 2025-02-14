package com.rcontarini.forge.domain

class ExercisesSerieModel(
    val exerciseModel: ExerciseModel,
    val numberOfSerie: Int,
    val kilogram: Int,
    val numberOfRepetitions: Int,
    val status: StatusEnum
)
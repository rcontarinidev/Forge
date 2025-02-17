package com.rcontarini.forge.domain

data class ExerciseModel(
    val id: Int,
    val title: String,
    val description: String,
    val typeExercise: TypeExerciseModel,
    val url: String,
    val creationDate: String,
    val listExercisesSerie: List<ExercisesSerieModel> = arrayListOf(),
    val status: StatusEnum
)
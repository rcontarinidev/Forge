package com.rcontarini.forge.domain

class RoutineModel(
    val title: String,
    val description: String,
    val listExercises: List<ExerciseModel>? = null,
    val initialDate: String,
    val endDate: String? = null,
    val status: String
)
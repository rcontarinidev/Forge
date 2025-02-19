package com.rcontarini.forge.domain

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
class RoutineModel(
    @DocumentId
    val id: String,
    val title: String,
    val description: String,
    val listExercises: List<ExerciseModel>? = null,
    val initialDate: String,
    val endDate: String? = null,
    val status: String
)
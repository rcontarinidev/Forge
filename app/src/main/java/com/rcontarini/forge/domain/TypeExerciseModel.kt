package com.rcontarini.forge.domain

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class TypeExerciseModel(
    @DocumentId
    val id: String,
    val title: String
)
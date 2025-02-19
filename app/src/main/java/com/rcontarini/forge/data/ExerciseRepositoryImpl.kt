package com.rcontarini.forge.data

import com.google.firebase.firestore.FirebaseFirestore
import com.rcontarini.forge.domain.ExerciseModel
import kotlinx.coroutines.tasks.await
import java.lang.Exception

class ExerciseRepositoryImpl(
    private val db: FirebaseFirestore
) : ExerciseRepository {
    override suspend fun getExercises(): List<ExerciseModel> {
        return try {
            db.collection("exercises")
                .get()
                .await()
                .toObjects(ExerciseModel::class.java)
        } catch (ex: Exception) {
            emptyList()
        }
    }
}
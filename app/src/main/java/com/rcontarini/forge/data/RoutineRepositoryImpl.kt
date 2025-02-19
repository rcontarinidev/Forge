package com.rcontarini.forge.data

import com.google.firebase.firestore.FirebaseFirestore
import com.rcontarini.forge.domain.RoutineModel
import kotlinx.coroutines.tasks.await

class RoutineRepositoryImpl(
    private val db: FirebaseFirestore
) : RoutineRepository {
    override suspend fun getRoutines(): List<RoutineModel> {
        return try {
            db.collection("routine")
                .get()
                .await()
                .toObjects(RoutineModel::class.java)
        } catch (ex: Exception) {
            emptyList()
        }
    }

    override suspend fun createRoutine(routineModel: RoutineModel) {
        try {
            db.collection("routine")
                .add(routineModel)
                .addOnSuccessListener {

                }
                .addOnFailureListener {

                }
        } catch (ex: Exception) {

        }
    }

    override suspend fun deleteRoutine(routineModel: RoutineModel) {
        try {
            db.collection("routine")
                .document(routineModel.id)
                .delete()
                .addOnSuccessListener {

                }
                .addOnFailureListener {

                }
        } catch (ex: Exception) {

        }

    }

    override suspend fun updatedRoutine(routineModel: RoutineModel) {
        try {
            db.collection("routine")
                .document(routineModel.id)
                .set(routineModel)
                .addOnSuccessListener {

                }
                .addOnFailureListener {

                }
        } catch (ex: Exception) {

        }
    }
}
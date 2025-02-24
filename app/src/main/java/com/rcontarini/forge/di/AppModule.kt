package com.rcontarini.forge.di

import com.google.firebase.firestore.FirebaseFirestore
import com.rcontarini.forge.data.ExerciseRepositoryImpl
import com.rcontarini.forge.data.RoutineRepositoryImpl
import com.rcontarini.forge.domain.usecase.GetExercisesUseCase
import com.rcontarini.forge.domain.usecase.GetRoutinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFirebaseFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }

    @Provides
    @Singleton
    fun provideExerciseRepository(db: FirebaseFirestore): ExerciseRepositoryImpl {
        return ExerciseRepositoryImpl(db = db)
    }

    @Provides
    @Singleton
    fun provideGetExercisesUseCase(repository: ExerciseRepositoryImpl): GetExercisesUseCase {
        return GetExercisesUseCase(exerciseRepositoryImpl = repository)
    }

    @Provides
    @Singleton
    fun provideRoutineRepository(db: FirebaseFirestore): RoutineRepositoryImpl {
        return RoutineRepositoryImpl(db = db)
    }

    @Provides
    @Singleton
    fun provideGetRoutinesUseCase(repository: RoutineRepositoryImpl): GetRoutinesUseCase {
        return GetRoutinesUseCase(routineRepositoryImpl = repository)
    }
}
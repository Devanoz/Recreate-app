package org.tensorflow.codelabs.objectdetection.di

import android.content.Context

import org.tensorflow.codelabs.objectdetection.data.repository.AppRepository
import org.tensorflow.codelabs.objectdetection.data.repository.ProfileRepository

object Injection {
    fun provideAuthRepository(context: Context): AppRepository {
        return AppRepository(context = context)
    }
    fun provideProfileRepository(context: Context): ProfileRepository {
        return ProfileRepository(context)
    }
}
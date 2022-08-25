package io.prashant.starwars.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.prashant.starwars.data.remote.ApiConstants
import io.prashant.starwars.data.remote.Networking
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class ApplicationModule {

    @Singleton
    @Provides
    fun provideNetworkService(
        @ApplicationContext applicationContext: Context
    ) =
        Networking.create(
            ApiConstants.BASE_URL,
            applicationContext.cacheDir,
            5 * 1024 * 1024, // 5MB
        )
}

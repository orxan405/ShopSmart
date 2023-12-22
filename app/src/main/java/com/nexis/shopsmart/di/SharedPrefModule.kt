package com.farzin.shopsmart.di

import android.content.Context
import android.content.SharedPreferences
import com.nexis.shopsmart.util.MainSharedPrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object SharedPrefModule {


    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context) : SharedPreferences {
        return  context.getSharedPreferences("shopsmart_shared", Context.MODE_PRIVATE)
    }

    @Provides
    fun provideMainShared(sharedPreferences: SharedPreferences) : MainSharedPrefs {
        return MainSharedPrefs(sharedPreferences)
    }




}
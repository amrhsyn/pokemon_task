package me.ahch.justdicetask

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    companion object {
        const val IMPORTANT_CHANNEL_ID = "1401"
        const val GENERAL_CHANNEL_ID = "1402"
    }


    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val importantChannel = NotificationChannel(
                IMPORTANT_CHANNEL_ID,
                "Important",
                NotificationManager.IMPORTANCE_HIGH
            )
            importantChannel.description = "important notifications"

            val generalChannel = NotificationChannel(
                GENERAL_CHANNEL_ID,
                "General",
                NotificationManager.IMPORTANCE_HIGH
            )
            generalChannel.description = "general notifications"

            val manager = getSystemService(
                NotificationManager::class.java
            )
            manager.createNotificationChannel(importantChannel)
            manager.createNotificationChannel(generalChannel)
        }
    }
}



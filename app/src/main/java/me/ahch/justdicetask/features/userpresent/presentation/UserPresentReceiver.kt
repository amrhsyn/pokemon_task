package me.ahch.justdicetask.features.userpresent.presentation

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationManagerCompat
import me.ahch.justdicetask.App.Companion.IMPORTANT_CHANNEL_ID
import me.ahch.justdicetask.R


class UserPresentReceiver: BroadcastReceiver() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onReceive(context: Context?, p1: Intent?) {
        val action= p1?.action
        action?.let {
            if (action == Intent.ACTION_USER_PRESENT){

                context?.let { context->
                    sendNotification(context,IMPORTANT_CHANNEL_ID,"ACTION_USER_PRESENT","ACTION_USER_PRESENT")

                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun sendNotification(context: Context, channelId: String?, title: String, text: String) {
        val notification: Notification.Builder =
            Notification.Builder(context, channelId ?: IMPORTANT_CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(text)
                .setSmallIcon(com.google.android.material.R.drawable.ic_clock_black_24dp)
                .setBadgeIconType(R.drawable.ic_launcher_background)
                .setAutoCancel(false)

        NotificationManagerCompat.from(context).notify(1, notification.build())
    }
}

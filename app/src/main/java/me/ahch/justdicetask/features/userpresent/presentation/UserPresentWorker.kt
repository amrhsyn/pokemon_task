package me.ahch.justdicetask.features.userpresent.presentation

import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.Worker
import androidx.work.WorkerParameters
import me.ahch.justdicetask.R
import javax.inject.Inject
import kotlin.random.Random

class UserPresentWorker(private val context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
       // startForegroundService()

       return Result.success()
    }

    private suspend fun startForegroundService() {
        setForeground(
            ForegroundInfo(
                Random.nextInt(),
                NotificationCompat.Builder(context, "user present")
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentTitle("user present notification")
                    .build()
            )
        )
    }

}
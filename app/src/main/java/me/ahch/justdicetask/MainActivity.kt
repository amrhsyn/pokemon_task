package me.ahch.justdicetask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.work.Constraints
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import dagger.hilt.android.AndroidEntryPoint
import me.ahch.justdicetask.features.userpresent.presentation.UserPresentReceiver
import me.ahch.justdicetask.features.userpresent.presentation.UserPresentWorker
import java.util.concurrent.TimeUnit


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private var receiver: BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        registerWorker()
        setContent {
            PokemonApp()
        }
    }

    private fun registerWorker() {
        val constraints = Constraints.Builder()
            .setRequiresBatteryNotLow(true)
            .build()

        val userPresentWorker = PeriodicWorkRequestBuilder<UserPresentWorker>(5, TimeUnit.SECONDS)
            .setConstraints(constraints)
            .build()

        val workManager = WorkManager.getInstance(this)
        workManager.enqueue(userPresentWorker)

    }

    override fun onStart() {
        registerBroadcastReceiver()
        super.onStart()
    }

    override fun onStop() {
        if (receiver != null) {
            unregisterReceiver(receiver)
            receiver = null
        }
        super.onStop()

    }


    private fun registerBroadcastReceiver() {
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_USER_PRESENT)
        registerReceiver(UserPresentReceiver(), filter)
    }
}

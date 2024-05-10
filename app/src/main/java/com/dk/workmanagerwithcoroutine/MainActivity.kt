package com.dk.workmanagerwithcoroutine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

/**
 * wm + Coroutine
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wm = OneTimeWorkRequestBuilder<WorkManager2>().build()

        WorkManager.getInstance(this).enqueue(wm)
    }
}
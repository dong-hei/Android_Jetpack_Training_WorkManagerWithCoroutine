package com.dk.workmanagerwithcoroutine

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

/**
 * Dispatcher.default
 *
 * 경우에 따라 doWork()안에서 다음처럼 변환가능
 * withContext(Dispatcchers.IO){
 * }
 *
 */
class WorkManager2(context : Context, params : WorkerParameters) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result {

        test1()
        test2()
        return Result.success()
    }

    suspend fun test1(){
        for (i in 1..5) {
            delay(1000)
            Log.d("WorkManager2 txt1", i.toString())
        }
    }

    suspend fun test2(){
        for (i in 15..25) {
            delay(1000)
            Log.d("WorkManager2 txt2", i.toString())
        }
    }
}

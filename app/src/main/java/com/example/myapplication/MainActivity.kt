package com.example.myapplication


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.ViewModelDemo.MyViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class MainActivity : AppCompatActivity() {
   val obj =  BaseballGameEx()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // main()
        //obj.program()

    }

    fun main() = runBlocking { // this: CoroutineScope
        launch { // launch a new coroutine and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
           // log("@","World!")
            Log.e("TAG", "World!" )// print after delay
        }
        Log.e("TAG","Hello") // main coroutine continues while a previous one is delayed
    }
}
package com.example.myapplication.ActivityLifeCycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class Activity1 : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var textView: TextView
    private val builder = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        textView = findViewById(R.id.textView)
        Log.d(TAG, "onCreate MainActivity");
        // initialize member TextView so we can manipulate it later
        builder.append("onCreate()\n")
        textView.text = builder.toString()
    }
    fun gotoActivity2(view: View?) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }
    override fun onStart() {
        Log.d(TAG, "onStart MainActivity");
        builder.append("onStart()\n")
        textView.text = builder.toString()
        super.onStart()
    }

    override fun onPause() {
        Log.d(TAG, "onPause MainActivity");
        builder.append("onPause()\n")
        textView.text = builder.toString()
        //textView.text = "onPause"
        super.onPause()
    }

    override fun onResume() {
        Log.d(TAG, "onResume MainActivity");
        builder.append("onResume()\n")
        textView.text = builder.toString()
        //textView.text = "onResume"
        super.onResume()
    }

    override fun onStop() {
        Log.d(TAG, "onStop MainActivity");
        builder.append("onStop()\n")
        textView.text = builder.toString()
        //textView.text = "onStop"
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart MainActivity");
        builder.append("onRestart()\n")
        textView.text = builder.toString()
        //textView.text = "onRestart"
        super.onRestart()
    }
    override fun onDestroy() {
        Log.d(TAG, "onDestroy MainActivity");
        builder.append("onDestroy()")
        textView.text = builder.toString()
        builder.append(" ")
        //textView.text = "onDestroy"
        super.onDestroy()
    }
}
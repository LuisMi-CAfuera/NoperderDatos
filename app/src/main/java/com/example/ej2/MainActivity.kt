package com.example.ej2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onStop = 4
    private var onDestroy = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("On Create $onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("On Start $onStart")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume $onResume")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause $onPause")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy $onDestroy")
    }
}
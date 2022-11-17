package com.example.ej2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onStop = 4
    private var onDestroy = 5
    private lateinit var texto:EditText
    private lateinit var texto2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("On Create $onCreate")
        texto = findViewById(R.id.etName)
        texto2 = findViewById(R.id.etEmail)
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

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putString("nombre", texto.text.toString())
        savedInstanceState.putString("email", texto2.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        texto.setText(savedInstanceState.getString("nombre"))
        texto2.setText(savedInstanceState.getString("email"))


    }
}

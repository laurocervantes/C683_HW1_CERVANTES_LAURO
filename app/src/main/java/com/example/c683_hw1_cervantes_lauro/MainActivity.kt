package com.example.c683_hw1_cervantes_lauro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, HelloWorldHomeFragment::class.java)
            startActivity(intent)
        }

        Log.d("Main Activity", "Running onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Main Activity", "Running onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Main Activity", "Running onStart")
    }

    override fun onPause() {
        super.onPause()

        Log.d("Main Activity", "Running onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("Main Activity", "Running onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Main Activity", "Running onDestroy")
    }
}
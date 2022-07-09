package com.example.c683_hw1_cervantes_lauro

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity



/**
 * A simple [Fragment] subclass.
 * Use the [HelloWorldHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HelloWorldHomeFragment :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world_home)

        val backButton: View = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

            Log.d("Hello World Activity", "Running onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Hello World Activity", "Running onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Hello World Activity", "Running onStart")
    }

    override fun onPause() {
        super.onPause()

        Log.d("Hello World Activity", "Running onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("Hello World Activity", "Running onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Hello World Activity", "Running onDestroy")
    }
}
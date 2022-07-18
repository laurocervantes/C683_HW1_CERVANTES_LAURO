package com.example.c683_hw1_cervantes_lauro

import android.content.Intent
import android.graphics.drawable.ClipDrawable.VERTICAL
import android.icu.lang.UCharacter.DecompositionType.VERTICAL
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.VERTICAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL


/**
 * A simple [Fragment] subclass.
 * Use the [HelloWorldHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HelloWorldHomeFragment :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world_home)

        val adapter: RecyclerViewAdapter

        val backButton: View = findViewById(R.id.backButton)
        val recyclerView: RecyclerView = findViewById(R.id.rvMainprofile)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val datasetList = ArrayList<String>()
        datasetList.add("Contact 1")
        datasetList.add("Contact 2")
        datasetList.add("Contact 3")
        datasetList.add("Contact 4")

        val adapterDataList = RecyclerViewAdapter(datasetList)
        recyclerView.adapter = adapterDataList

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
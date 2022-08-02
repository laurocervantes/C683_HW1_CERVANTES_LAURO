package com.example.c683_hw1_cervantes_lauro.service

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.io.IOException
import java.nio.charset.Charset

class ContactDataProvider() {
    var contactList: MutableList<String>? = null

    var personName: ArrayList<String> = ArrayList()
    var dataChat: ArrayList<String> = ArrayList()




    private fun loadJSONFromAsset(context: Context): String {
        val json: String?
        try {
            val inputStream = context.assets.open("users_list.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            val charset: Charset = Charsets.UTF_8
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, charset)
        }
        catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }
        return json
    }

}

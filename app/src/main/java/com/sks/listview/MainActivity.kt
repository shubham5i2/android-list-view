package com.sks.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val countryList = resources.getStringArray(R.array.country_list)

        val arrayAdapter =
            ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, countryList)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val countryName = parent.getItemAtPosition(position).toString()

            Toast.makeText(this@MainActivity, "$countryName is selected", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
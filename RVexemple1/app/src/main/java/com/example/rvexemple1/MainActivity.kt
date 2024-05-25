package com.example.rvexemple1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  adapter: MyAdapter

    // This method is called when the activity is first created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This function enables edge-to-edge display, making content extend to the edges of the screen.
        enableEdgeToEdge()

        // Set the layout for this activity using the activity_main.xml layout file.
        setContentView(R.layout.activity_main)

        // Find the RecyclerView with the id "recyclerView" from the layout.
        val recyclerView =findViewById<RecyclerView>(R.id.recyclerView)

        // Create a list of Item objects, each containing a city name and an associated drawable resource.
        val itemList = listOf(
            Item("Athene", R.drawable.athene),
            Item("London", R.drawable.london),
            Item("Madrid", R.drawable.madrid),
            Item("Paris", R.drawable.paris),
            Item("Pekin", R.drawable.pekin),
            Item("Rabat", R.drawable.rabat),
            Item("Tokyo", R.drawable.tokyo),
            Item("Washington DC", R.drawable.washignton)
        )

        // Initialize the adapter with the list of items.
        adapter= MyAdapter(itemList)

        // Set the adapter for the RecyclerView.
        recyclerView.adapter=adapter

        // Set the layout manager for the RecyclerView. Here, LinearLayoutManager is used,
        // which displays items in a vertical or horizontal scrolling list.
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
}

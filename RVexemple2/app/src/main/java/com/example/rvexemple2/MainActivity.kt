package com.example.rvexemple2

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the toolbar in the layout
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        // Set the toolbar as the support action bar
        setSupportActionBar(toolbar)
        
        // Find the RecyclerView in the layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Create a list of food items with their images and names
        val foodList = listOf(
            Food(R.drawable.barbucue, "Barbecue"),
            Food(R.drawable.burger, "Burger"),
            Food(R.drawable.fish, "Fish"),
            Food(R.drawable.tajin, "Tajin"),
            Food(R.drawable.chawarma, "Chawarma"),
            Food(R.drawable.meat, "Meat"),
            Food(R.drawable.mixican, "Tacos Mexique"),
            Food(R.drawable.pasta, "Pasta"),
            Food(R.drawable.soup, "Soup"),
            Food(R.drawable.spanish_tacos, "Tacos Spain"),
            Food(R.drawable.tacos, "Tacos")
        )

        // Create and set the adapter for the RecyclerView
        adapter = FoodAdapter(foodList)
        recyclerView.adapter = adapter

        // Set the layout manager for the RecyclerView (GridLayoutManager with 2 columns)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}

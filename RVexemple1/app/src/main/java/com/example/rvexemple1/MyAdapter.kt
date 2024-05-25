package com.example.rvexemple1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList:List<Item>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Inner class to hold the views for each item in the RecyclerView.
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        // Reference to the TextView and ImageView in the item layout.
        val titleTextView: TextView = itemView.findViewById(R.id.textView)
        val imageView: ImageView=itemView.findViewById(R.id.imageView)
    }

    // This method is called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the item layout XML and create a new MyViewHolder instance with it.
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    // This method returns the total number of items in the data set held by the adapter.
    override fun getItemCount(): Int {
        return itemList.size
    }

    // This method updates the contents of the itemView at the given position.
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Get the current item from the list based on its position.
        val currentItem = itemList[position]

        // Set the title TextView text to the title of the current item.
        holder.titleTextView.text=currentItem.title

        // Set the imageView resource to the imageResource of the current item.
        holder.imageView.setImageResource(currentItem.imageResource)
    }
}

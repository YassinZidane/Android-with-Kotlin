package com.example.rvexemple2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: List<Food>) :RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val titleTextView: TextView=itemView.findViewById(R.id.textView)
        val imageView:ImageView=itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.foodlayout, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val curentItem=foodList[position]
        holder.titleTextView.text=curentItem.foodTitle
        holder.imageView.setImageResource(curentItem.foodImageResource)
    }
}
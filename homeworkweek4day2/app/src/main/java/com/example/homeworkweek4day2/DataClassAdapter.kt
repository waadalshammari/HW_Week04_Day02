package com.example.homeworkweek4day2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataClassAdapter(val app :  List<DataClassModel>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent, false
        )
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = app[position].text
        holder.image.setImageResource(app[position].image)
    }

    override fun getItemCount(): Int {
        return app.size
    }
}

class ViewHolder(view: View): RecyclerView.ViewHolder(view){
val text : TextView = view.findViewById(R.id.text)
    val image: ImageView = view.findViewById(R.id.image)
}
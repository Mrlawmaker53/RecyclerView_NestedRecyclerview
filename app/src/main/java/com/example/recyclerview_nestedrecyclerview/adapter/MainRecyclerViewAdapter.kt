package com.example.recyclerview_nestedrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_nestedrecyclerview.R
import com.example.recyclerview_nestedrecyclerview.model.AllCategory

class MainRecyclerViewAdapter(var context: Context,private val allCategory: List<AllCategory>):RecyclerView.Adapter<MainRecyclerViewAdapter.MainRecyclerViewHolder> (){
    inner class MainRecyclerViewHolder (var itemView: View):RecyclerView.ViewHolder(itemView){
var categoryTitle:TextView
        init{
            categoryTitle=itemView.findViewById<TextView>(R.id.cat_title_textview_id)

        }
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
    return MainRecyclerViewHolder(LayoutInflater.from(context).inflate(R.layout.main_recyclerview_row_item,parent,false))
    }

    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {
holder.categoryTitle!!.text =allCategory[position].categorytitle
    }

    override fun getItemCount(): Int =allCategory.size
}
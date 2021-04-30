package com.example.foodapp.ui.main.Main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.ui.main.Data.ItemData

class MainItemListAdapter(val itemList: List<ItemData>): RecyclerView.Adapter<MainItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainItemViewHolder {
        val itemVIew = LayoutInflater.from(parent.context)
                .inflate(R.layout.main_item, parent, false)

        return MainItemViewHolder(itemVIew)
    }

    override fun onBindViewHolder(holder: MainItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}
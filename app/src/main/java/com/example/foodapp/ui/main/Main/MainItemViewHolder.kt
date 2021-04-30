package com.example.foodapp.ui.main.Main

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.ui.main.Data.ItemData

class MainItemViewHolder(v: View): RecyclerView.ViewHolder(v) {
    var view: View = v

    fun bind(item: ItemData) {
        val mName = view.findViewById<TextView>(R.id.mName)
        val mAddress = view.findViewById<TextView>(R.id.mAddress)
        val mCount = view.findViewById<TextView>(R.id.mCount)
        val mImage = view.findViewById<ImageView>(R.id.mImage)

        mName.text = item.name
        mAddress.text = item.address
        mCount.text = item.average.toString()
        mImage.setImageResource(R.drawable.ic_launcher_background)
    }
}
package com.example.foodapp.ui.main.Main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.ui.main.Data.ItemData
import com.example.foodapp.ui.main.PageViewModel

class MainFragment: Fragment() {
    lateinit var adapter:MainItemListAdapter
    private val myViewModel by activityViewModels<PageViewModel>{ ViewModelProvider.NewInstanceFactory() }

    // 리스트 데이터
    val itemList: List<ItemData> = listOf(
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
            ItemData("핑핑치킨", "춘천시 우리집", 5.0f),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myViewModel.setIndex(0)

        // 뷰 홀더 어댑터
        adapter = MainItemListAdapter(itemList)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val main = inflater.inflate(R.layout.fragment_main, container, false)

        val mRecyclerView = main.findViewById<RecyclerView>(R.id.mRecyclerView)
        mRecyclerView.adapter = adapter

        return main
    }
}
package com.example.foodapp.ui.main.Setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.foodapp.R
import com.example.foodapp.ui.main.PageViewModel

class SettingFragment : Fragment() {
    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(3)
            //setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var setting = inflater.inflate(R.layout.fragment_setting, container, false)
        // fragment_setting.xml 내부에 구성한 View들을 가져옴


        // pageViewModel로 View들을 채움

        return setting
    }
}
package com.example.foodapp.ui.main.Main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.foodapp.R
import com.example.foodapp.ui.main.PageViewModel

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {
    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ???
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(1)
            //setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // 프래그먼트 생성
        val root = inflater.inflate(R.layout.fragment_main, container, false)

        // 내부에  텍스트뷰를 코드로 가져옴
        //val textView: TextView = root.findViewById(R.id.section_label)

        // 텍스트뷰의 내용을 채움
        //pageViewModel.text.observe(this, Observer<String> {
        //    textView.text = it
        //})
        return root
    }

    // 프래그먼트 인스턴스를 static으로 생성
    // (자바의 TestClass.Instance;와 같은 의미이다)
    /*companion object {
        *//**
         * The fragment argument representing the section number for this
         * fragment.
         *//*
        private const val ARG_SECTION_NUMBER = "section_number"

        *//**
         * Returns a new instance of this fragment for the given section
         * number.
         *//*
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
                // var arguments = Bundle()
                // arguments.putInt(???, ???)
            }
        }
    }*/
}
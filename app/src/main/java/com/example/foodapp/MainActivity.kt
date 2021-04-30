package com.example.foodapp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.foodapp.ui.main.Manager.SectionsPagerAdapter
import androidx.activity.viewModels
import com.example.foodapp.ui.main.Data.ItemData
import com.example.foodapp.ui.main.Main.MainItemListAdapter
import com.example.foodapp.ui.main.PageViewModel

class MainActivity : AppCompatActivity() {
    // ViewModel 프래그먼트와 액티비티 공유
    private val myActivityModel by viewModels<PageViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        // 기본 세팅
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 탭 버튼
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        // 각 화면들의 메인 뷰(프레그먼트)는 S.P.A가 맡음
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        // 제목을 나타내는 TabLayout은 ViewPager와 연동함
        tabs.setupWithViewPager(viewPager)

        /* 결국,
         *    제목           화면           화면 출력 매니저
         * TabLayout <--> ViewPager <--> FragmentPagerManager 의 꼴이다
         */

        // 이메일 버튼
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
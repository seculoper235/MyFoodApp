package com.example.foodapp.ui.main.Manager

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.foodapp.R
import com.example.foodapp.ui.main.Favorite.FavoratieFragment
import com.example.foodapp.ui.main.Main.MainFragment
import com.example.foodapp.ui.main.Setting.SettingFragment
import java.lang.NullPointerException

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
// FragmentPagerAdapter? => 페이지 별로 프래그먼트를 매핑해줌
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    // position에 따라, 메인으로 보여줄 프래그먼트를 매핑한다
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return MainFragment()
            1 -> return FavoratieFragment()
            2 -> return SettingFragment()
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1)
        // 없는 탭을 선택했을 시, 에러를 던짐
        return throw NullPointerException()
    }

    // 각 position 별로 매핑될 프래그먼트의 Title을 가져온다
    // (이 값은 TabLayout과 연동된다)
    // values의 <resource>에서 TAB_TITLES[]에 해당하는 태그 이름을 가져온다
    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    // position의 최대값을 지정한다
    // (TabLayout이 해당 숫자만큼 분할된다)
    override fun getCount(): Int {
        // Show 3 total pages.
        return TAB_TITLES.size
    }
}
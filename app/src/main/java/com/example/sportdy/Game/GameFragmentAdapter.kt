package com.example.sportdy.Game

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class GameFragmentAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        val fragment: Fragment = when(position) {
            0 -> MyGameFragment()
            1 -> FindGameFragment()
            2 -> HistoryFragment()
            else -> MyGameFragment()
        }
        return fragment
    }

    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "My Game"
            1 -> "Find Game"
            2 -> "History"
            else -> "My Game"
        }
    }

}


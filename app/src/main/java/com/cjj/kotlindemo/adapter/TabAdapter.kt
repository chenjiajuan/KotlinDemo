package com.cjj.kotlindemo.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by chenjiajuan on 2018/4/12.
 */
class TabAdapter(fm: FragmentManager, var fragmentList: ArrayList<Fragment>, var  tabList:ArrayList<String>) :FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }
    override fun getCount(): Int {
        return tabList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return tabList[position]
    }


}
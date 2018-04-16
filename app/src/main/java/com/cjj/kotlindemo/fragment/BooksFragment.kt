package com.cjj.kotlindemo.fragment

import android.support.design.widget.TabLayout
import android.support.design.widget.TabLayout.MODE_SCROLLABLE
import android.support.v4.app.Fragment
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.adapter.TabAdapter
import kotlinx.android.synthetic.main.fragment_books.*

/**
 * Created by chenjiajuan on 2018/4/10.
 */
class BooksFragment : BaseFragment() {
    private var TAB_TITLES = arrayListOf("耽美", "悬疑","推理", "科幻", "童话", "古风","哲学","互联网","金融" )
    override fun getBundle() {
    }

    override fun initView() {
        var areaAdapter = TabAdapter(childFragmentManager, getContentFragmentList(), TAB_TITLES)
        viewPager.adapter = areaAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.tabMode = MODE_SCROLLABLE
        tabLayout.getTabAt(0)?.select()
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
            }

        })
    }

    private fun getContentFragmentList(): ArrayList<Fragment> {
        var url="https://api.douban.com/v2/book/search?tag="
        var fragmentList = ArrayList<Fragment>()
        TAB_TITLES.indices.mapTo(fragmentList) {
            ContentFragment.getInstance("$url${TAB_TITLES[it]}") }
        return fragmentList
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): BooksFragment {
            var fragment = BooksFragment()
            return fragment
        }
    }


    override fun getLayoutResId(): Int = R.layout.fragment_books

}
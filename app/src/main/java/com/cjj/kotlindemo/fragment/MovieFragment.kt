package com.cjj.kotlindemo.fragment

import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.adapter.TabAdapter
import kotlinx.android.synthetic.main.fragment_books.*

/**
 * Created by chenjiajuan on 2018/4/10.
 */
class MovieFragment : BaseFragment() {
    private var TAB_TITLES = arrayListOf("热门","华语","爱情","欧美","日本","喜剧","推理", "科幻")
    override fun getBundle() {
    }

    override fun initView() {
        var areaAdapter = TabAdapter(childFragmentManager, getContentFragmentList(), TAB_TITLES)
        viewPager.adapter = areaAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        tabLayout.getTabAt(0)?.select()
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): MovieFragment {
            var fragment = MovieFragment()
            return fragment
        }
    }


    override fun getLayoutResId(): Int = R.layout.fragment_movie

    private fun getContentFragmentList(): ArrayList<Fragment> {
        var url="https://api.douban.com/v2/movie/search?tag="
        var fragmentList = ArrayList<Fragment>()
        TAB_TITLES.indices.mapTo(fragmentList) { MovieContentFragment.getInstance("$url${TAB_TITLES[it]}") }
        return fragmentList
    }
}
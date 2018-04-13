package com.cjj.kotlindemo.fragment

import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/10.
 */
class MovieFragment :BaseFragment() {
    override fun getBundle() {
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): MovieFragment {
            var  fragment= MovieFragment()
            return fragment
        }
    }


    override fun getLayoutResId(): Int = R.layout.fragment_movie
}
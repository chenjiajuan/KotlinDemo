package com.cjj.kotlindemo.fragment

import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/10.
 */
class PicturnFragment :BaseFragment() {

    companion object {
        fun newInstance():PicturnFragment{
            var  fragment=PicturnFragment()
            return fragment
        }
    }


    override fun getLayoutResId(): Int = R.layout.fragment_picturn
}
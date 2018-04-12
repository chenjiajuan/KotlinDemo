package com.cjj.kotlindemo.fragment

import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/10.
 */
class AreaFragment :BaseFragment() {

    companion object {
        fun newInstance():AreaFragment{
            var  fragment=AreaFragment()
            return  fragment
        }
    }


    override fun getLayoutResId(): Int = R.layout.fragment_area

}
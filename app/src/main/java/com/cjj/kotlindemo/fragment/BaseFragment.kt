package com.cjj.kotlindemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by chenjiajuan on 2018/4/10.
 */
abstract class BaseFragment : Fragment() {
    private var mView: View? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater?.inflate(getLayoutResId(), container, false)
        return mView
    }

      fun getRootView():View{
         return mView!!
     }

    abstract fun getLayoutResId(): Int
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getBundle()
        initView()
        initData()
    }

    abstract fun getBundle()

    abstract fun initView()
    abstract fun initData()
}
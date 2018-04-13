package com.cjj.kotlindemo.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import com.alibaba.fastjson.JSON
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.activity.ListActivity
import com.cjj.kotlindemo.adapter.BookListAdapter
import com.cjj.kotlindemo.bo.BookItem
import com.cjj.kotlindemo.interfac.OnItemClickListener
import kotlinx.android.synthetic.main.fragment_content.*
import okhttp3.*
import java.io.IOException

/**
 * Created by chenjiajuan on 2018/4/12.
 */
class ContentFragment : BaseFragment() {
    var url:String="https://api.douban.com/v2/book/search?"
    var bookAdapter:BookListAdapter?=null
    override fun getBundle() {
       var tag= arguments.getString("url")
        url=url+"tag="+tag+"&count=40"
        Log.e("TAG"," url : "+url)
    }

    companion object {
        fun  getInstance(str:String):ContentFragment{
            var  args=Bundle()
            args.putString("url",str)
            var  contentFragment=ContentFragment()
            contentFragment.arguments=args
            return contentFragment
        }
    }

    override fun getLayoutResId(): Int = R.layout.fragment_content

    override fun initView() {
        tvContentId.text=url
        ryBookList.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        ryBookList.addItemDecoration(ListActivity.SpacesItemDecoration(5))
        bookAdapter?.setOnItemClickListener(object:OnItemClickListener{
            override fun onItemClick(position: Int, name: String?) {

            }
        })
    }

    override fun initData() {
        var okphht= OkHttpClient()
        var builder= Request.Builder().get().url(url)
        var  request=builder.build()
        var call=okphht.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {

            }

            override fun onResponse(call: Call?, response: Response?) {
                var  string=response?.body()?.string()
                var data= JSON.parseObject(string, BookItem::class.java)
                Log.e("TAG","data : "+data.books.toString())
                bookAdapter= BookListAdapter(context,data)
                myHandler.sendEmptyMessage(0)
            }
        })
    }

    private val myHandler:Handler =object :Handler(Looper.getMainLooper()){
        override fun handleMessage(msg: Message?) {
            ryBookList.adapter=bookAdapter
        }
    }
}
package com.cjj.kotlindemo.activity

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.alibaba.fastjson.JSON
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.bo.BookDetail
import okhttp3.*
import java.io.IOException

/**
 * Created by chenjiajuan on 2018/4/13.
 */
class BookDetailActivity:Activity() {
    var url:String="https://api.douban.com/v2/book/"
    var bookId:String ?=null
    var bookDetail:BookDetail?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)
        intent.getStringExtra("bookId")
        url+=bookId
        initData()
    }

    private fun initData() {
        var okHttp=OkHttpClient()
        var request=Request.Builder().url(url).build()
        var call=okHttp.newCall(request)
        call.enqueue(object:Callback{
            override fun onFailure(call: Call?, e: IOException?) {
            }

            override fun onResponse(call: Call?, response: Response?) {
                var string=response?.body()?.string()
                bookDetail=JSON.parseObject(string,BookDetail::class.java)
                myHandler.sendEmptyMessage(0)

            }
        })
    }

    private  val myHandler:Handler=object :Handler(Looper.getMainLooper()){
        override fun handleMessage(msg: Message?) {
             refreshView()
        }
    }

    fun  refreshView(){

    }
}
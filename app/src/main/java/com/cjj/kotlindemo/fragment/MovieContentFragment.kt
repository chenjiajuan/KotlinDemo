package com.cjj.kotlindemo.fragment

import android.graphics.Rect
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import android.view.View
import com.alibaba.fastjson.JSON
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.adapter.MovieListAdapter
import com.cjj.kotlindemo.bo.MovieItem
import com.cjj.kotlindemo.interfac.OnItemClickListener
import kotlinx.android.synthetic.main.fragment_content.*
import okhttp3.*
import java.io.IOException

/**
 * Created by chenjiajuan on 2018/4/12.
 */
class MovieContentFragment : BaseFragment() {
    private val TAG: String ="MovieContentFragment"
    private var url: String = ""
    private var movieAdapter: MovieListAdapter? = null
    private var type: String? = null
    private var ryBookList:RecyclerView ?=null
    private var data:MovieItem ?=null

    override fun getBundle() {
        type = arguments.getString("url")
        url = type+"&count=40"
        Log.e(TAG, " url : $url")
    }

    companion object {
        fun getInstance(url: String ): MovieContentFragment {
            var args = Bundle()
            args.putString("url", url)
            var contentFragment = MovieContentFragment()
            contentFragment.arguments = args
            return contentFragment
        }
    }

    override fun getLayoutResId(): Int = R.layout.fragment_content



    override fun initView() {
        tvContentId.text = url
        this.ryBookList=getRootView().findViewById(R.id.ryBookList)

    }

    override fun initData() {
        var okphht = OkHttpClient()
        var builder = Request.Builder().get().url(url)
        var request = builder.build()
        var call = okphht.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {

            }

            override fun onResponse(call: Call?, response: Response?) {
                var string = response?.body()?.string()
                 data= JSON.parseObject(string, MovieItem::class.java) ?: return
                movieAdapter?.setOnItemClickListener(object : OnItemClickListener {
                    override fun onItemClick(position: Int, name: String?) {
                        Log.e("TAG", "position : $position + name $name ")
                        /**
                        var intent = Intent(context, BookDetailActivity::class.java)
                        intent.putExtra("bookId", name)
                        intent.putExtra("title", type)
                        startActivity(intent)
                         */
                    }
                })
                myHandler.sendEmptyMessage(0)
            }
        })
    }

    private val myHandler: Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message?) {
            movieAdapter = MovieListAdapter(context,data!!)
            ryBookList?.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
            ryBookList?.addItemDecoration( SpacesItemDecoration(5))
            ryBookList?.adapter = movieAdapter
        }
    }
    class SpacesItemDecoration(private var space: Int = 16) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
            outRect?.left = space
            outRect?.right = space
            outRect?.bottom = space
            if (parent?.getChildAdapterPosition(view) == 0) {
                outRect?.top = 12
            }
        }

    }
}
package com.cjj.kotlindemo.activity

import android.graphics.Rect
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.alibaba.fastjson.JSON
import com.bumptech.glide.Glide
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.adapter.AnnotationsAdapter
import com.cjj.kotlindemo.bo.Annotations
import com.cjj.kotlindemo.bo.BookDetail
import com.cjj.kotlindemo.view.MaxLinearLayoutManager
import okhttp3.*
import java.io.IOException

/**
 * Created by chenjiajuan on 2018/4/13.
 */
class BookDetailActivity : BaseBarActivity() {
    private val TAG = BookDetailActivity::class.java!!.simpleName
    private var url: String = "https://api.douban.com/v2/book/"
    private var bookId: String? = null
    private var bookDetail: BookDetail? = null
    private var ivDetailPicture: ImageView? = null
    private var tvDetailName: TextView? = null
    private var tvDetailAuthor: TextView? = null
    private var tvDetailPublisher: TextView? = null
    private var tvDetailPubDate: TextView? = null
    private var tvDetailSummary: TextView? = null
    private var tvDetailCatalog: TextView? = null
    private var titleName: String? = null
    private var annotations: Annotations? = null
    private var ryAnnotations: RecyclerView? = null
    private var annotationAdapter: AnnotationsAdapter? = null
    private fun initData() {
        var okHttp = OkHttpClient()
        var request = Request.Builder().url(url).build()
        var call = okHttp.newCall(request)
        call.enqueue(object : Callback {

            override fun onFailure(call: Call?, e: IOException?) {
            }

            override fun onResponse(call: Call?, response: Response?) {
                var string = response?.body()?.string()
                bookDetail = JSON.parseObject(string, BookDetail::class.java)
                myHandler.sendEmptyMessage(0)

            }
        })
        ///v2/book/:id/annotations
        var annotationUrl = "$url/annotations"
        Log.e(TAG, "annotationsUrl : " + annotationUrl)
        var requestAnnotations = Request.Builder().url(annotationUrl).build()
        var annotationCall = okHttp.newCall(requestAnnotations)
        annotationCall.enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
            }

            override fun onResponse(call: Call?, response: Response?) {
                var annString = response?.body()?.string()
                annotations = JSON.parseObject(annString, Annotations::class.java)
                if (annotations?.annotations == null || annotations?.annotations!!.size <= 0) {
                    return
                    Log.e(TAG, "该书无读书笔记")
                }
                myHandler.sendEmptyMessage(1)

            }

        })
    }

    override fun setTile(text: TextView) {
        text.text = titleName

    }

    override fun setContent(rlContent: RelativeLayout) {
        var view = LayoutInflater.from(this).inflate(R.layout.activity_book_detail, null, false)
        rlContent.addView(view)
        ivDetailPicture = view.findViewById(R.id.ivDetailPicture)
        tvDetailName = view.findViewById(R.id.tvDetailName)
        tvDetailAuthor = view.findViewById(R.id.tvDetailAuthor)
        tvDetailPublisher = view.findViewById(R.id.tvDetailPublisher)
        tvDetailPubDate = view.findViewById(R.id.tvDetailPubDate)
        tvDetailSummary = view.findViewById(R.id.tvDetailSummary)
        tvDetailCatalog = view.findViewById(R.id.tvDetailCatalog)
        ryAnnotations = view.findViewById(R.id.ryAnnotations)

        ryAnnotations?.visibility = View.GONE
        bookId = intent.getStringExtra("bookId")
        titleName = intent.getStringExtra("title")
        url += bookId
        Log.e(TAG, "url :$url")
        initData()

    }

    private val myHandler: Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message?) {
            when (msg?.what) {
                0 -> refreshView()
                1 -> refreshAnnotations()
            }

        }
    }

    fun refreshView() {
        Glide.with(this).load(bookDetail?.image).into(ivDetailPicture)
        tvDetailName?.text = bookDetail?.title
        tvDetailAuthor?.text = "作者: " + bookDetail?.author.toString()
        tvDetailPublisher?.text = "出版社: " + bookDetail?.publisher
        tvDetailPubDate?.text = "出版日: " + bookDetail?.pubdate
        tvDetailCatalog?.text = bookDetail?.catalog
        tvDetailSummary?.text = bookDetail?.summary
    }

    fun refreshAnnotations() {
        ryAnnotations?.visibility = View.VISIBLE
        var linearLayoutManager = MaxLinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        ryAnnotations?.layoutManager = linearLayoutManager
        ryAnnotations?.addItemDecoration(SpacesItemDecoration(15))
        annotationAdapter = AnnotationsAdapter(this, annotations!!)
        ryAnnotations?.adapter = annotationAdapter
        ryAnnotations?.setHasFixedSize(true)
        ryAnnotations?.isNestedScrollingEnabled = false

    }

    class SpacesItemDecoration(var space: Int = 16) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
            outRect?.left = space
            outRect?.right = space
            if (parent?.getChildAdapterPosition(view) == 0) {
                outRect?.left = +15
            }

        }

    }
}
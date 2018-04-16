package com.cjj.kotlindemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.bo.BookItem
import com.cjj.kotlindemo.interfac.OnItemClickListener

/**
 * Created by chenjiajuan on 2018/4/12.
 */
class BookListAdapter : RecyclerView.Adapter<BookListAdapter.BookItemViewHolder> {
    private val TAG = BookListAdapter::class.java.simpleName
    private var context: Context? = null
    private var mBookItem: BookItem? = null
    private var onItemClick: OnItemClickListener? = null
    private var requestOptions = RequestOptions()

    constructor(context: Context, bookList: BookItem) {
        this.context = context
        this.mBookItem = bookList
//        requestOptions.override(context?.resources?.getDimension(R.dimen.dp_100)!!.toInt(), context?.resources?.getDimension(R.dimen.dp_160)!!.toInt())

    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClick = onItemClickListener
    }

    override fun onBindViewHolder(holder: BookItemViewHolder?, position: Int) {
        var bookItem = mBookItem!!.books[position]
        holder?.tvBookName?.text = bookItem.title
        holder?.tvBookDescribe?.text = bookItem.summary
        holder?.tvBookAuthor?.text = bookItem.author?.toString()
        holder?.tvAverage?.text = bookItem.rating.average
        Glide.with(context).load(bookItem?.images?.small)
                .into(holder?.ivBookPicture)
        holder?.rtNumRaters?.rating = bookItem.rating?.average!!.toFloat()
        holder?.itemView?.setOnClickListener {
            Log.e(TAG, "onClicks")
            this.onItemClick?.onItemClick(position, bookItem.id)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BookItemViewHolder {
        return BookItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_book_describe, parent, false))
    }

    override fun getItemCount(): Int = mBookItem!!.books.size

    class BookItemViewHolder : RecyclerView.ViewHolder {
        var ivBookPicture: ImageView? = null
        var tvBookName: TextView? = null
        var tvBookDescribe: TextView? = null
        var tvBookAuthor: TextView? = null
        var tvAverage: TextView? = null
        var rtNumRaters: RatingBar? = null

        constructor(view: View) : super(view) {
            ivBookPicture = view.findViewById(R.id.ivBookPicture)
            tvBookDescribe = view.findViewById(R.id.tvBookDescribe)
            tvBookName = view.findViewById(R.id.tvBookName)
            tvBookAuthor = view.findViewById(R.id.tvBookAuthor)
            tvAverage = view.findViewById(R.id.tvAverage)
            rtNumRaters = view.findViewById(R.id.rtNumRaters)

        }

    }
}
package com.cjj.kotlindemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.bo.BookItem
import com.cjj.kotlindemo.interfac.OnItemClickListener

/**
 * Created by chenjiajuan on 2018/4/12.
 */
class BookListAdapter : RecyclerView.Adapter<BookListAdapter.BookItemViewHolder> {
    var mContext:Context?=null
    var mBookItem:BookItem?=null
    var onItemClick: OnItemClickListener?=null

    constructor(context:Context,bookList:BookItem){
        this.mContext=context
        this.mBookItem=bookList
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
         this.onItemClick=onItemClickListener
    }
    override fun onBindViewHolder(holder: BookItemViewHolder?, position: Int) {
        var bookItem=mBookItem!!.books[position]
        holder?.tvBookName?.text=bookItem.title
        holder?.tvBookDescribe?.text=bookItem.author.toString()
        Glide.with(mContext).load(bookItem?.image).into(holder?.ivBookPicture)
        holder?.itemView?.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                onItemClick?.onItemClick(position,bookItem.alt)
            }
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BookItemViewHolder {

        return BookItemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_book_describe,parent,false))
    }

    override fun getItemCount(): Int =mBookItem!!.books.size


    class BookItemViewHolder:RecyclerView.ViewHolder{
        var ivBookPicture:ImageView?=null
        var tvBookName:TextView?=null
        var tvBookDescribe:TextView?=null

        constructor(view:View) :super(view){
            ivBookPicture=view.findViewById(R.id.ivBookPicture)
            tvBookDescribe=view.findViewById(R.id.tvBookDescribe)
            tvBookName=view.findViewById(R.id.tvBookName)

        }

    }
}
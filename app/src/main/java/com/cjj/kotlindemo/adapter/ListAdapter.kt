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
import com.cjj.kotlindemo.bo.Item
import com.cjj.kotlindemo.interfac.OnItemClickListener

/**
 * Created by chenjiajuan on 2018/4/9.
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.BookListViewHolder> {
    var list:ArrayList<Item> ?=null
    var context:Context?=null
    var onItemClickItem:OnItemClickListener?=null
    constructor(context: Context,list: ArrayList<Item>){
        this.context=context
        this.list=list
    }

    open fun setOnItemClickListener(onItemClickItem:OnItemClickListener){
        this.onItemClickItem=onItemClickItem

    }

    override fun onBindViewHolder(holder: BookListViewHolder?, position: Int) {
        holder?.tvListItem!!.text=list?.get(position)?.name
        Glide.with(context).load(list?.get(position)?.url).into(holder.ivListItem)
        holder?.ivListItem?.setOnClickListener({
           this.onItemClickItem?.onItemClick(position,list?.get(position)?.name)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BookListViewHolder {
        return BookListViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return list?.size as Int
    }

    class BookListViewHolder:RecyclerView.ViewHolder{
        var tvListItem:TextView?=null
        var ivListItem:ImageView?=null
        constructor(view:View):super(view){
            tvListItem=view.findViewById(R.id.tv_list_item)
            ivListItem=view.findViewById(R.id.iv_list_item)
        }

    }
}
package com.cjj.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/**
 * Created by chenjiajuan on 2018/4/9.
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    var list:ArrayList<Item> ?=null
    var context:Context?=null
    constructor(context: Context,list: ArrayList<Item>){
        this.context=context
        this.list=list
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder?.tvListItem!!.text=list?.get(position)?.name
        Glide.with(context).load(list?.get(position)?.url).into(holder.ivListItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item,parent,false))
    }

    override fun getItemCount(): Int {
        return list?.size as Int
    }

    class MyViewHolder:RecyclerView.ViewHolder{
        var tvListItem:TextView?=null
        var ivListItem:ImageView?=null
        constructor(view:View):super(view){
            tvListItem=view.findViewById(R.id.tv_list_item)
            ivListItem=view.findViewById(R.id.iv_list_item)
        }

    }
}
package com.cjj.kotlindemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.bo.Annotations

class AnnotationsAdapter :RecyclerView.Adapter<RecyclerView.ViewHolder>{
    var annotation:Annotations?=null
    var context:Context?=null

    enum class ITEM_TYPE {
        ITEM_TYPE_CONTENT,
        ITEM_TYPE_END
    }

    constructor(context:Context,annotation: Annotations){
        this.annotation=annotation
        this.context=context

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            ITEM_TYPE.ITEM_TYPE_CONTENT.ordinal->
                ContentViewHolder(LayoutInflater.from(context).inflate(R.layout.item_book_annotations,parent,false))
            ITEM_TYPE.ITEM_TYPE_END.ordinal->
                EndViewHolder(LayoutInflater.from(context).inflate(R.layout.item_book_annotations_end,parent,false))
            else ->
                throw IllegalArgumentException("unKnow ViewHolder Type")

        }
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        when(holder){
            is ContentViewHolder -> {
                var  art=annotation!!.annotations[position]
                holder?.tvAltTitle?.text="第"+art.page_no+"页"
                holder?.tvLikeCount?.text=art.comments_count.toString()
                holder?.tvAnnotationContent?.text=art.content
                holder?.tvAuthor?.text=art.author_user.name
                holder?.tvTime?.text=art.time
            }
            is EndViewHolder->{

            }
        }
    }

    override fun getItemCount(): Int {
        return if (annotation?.annotations!!.size>5){
            5
        }else{
            annotation?.annotations!!.size
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position<(itemCount-1)) ITEM_TYPE.ITEM_TYPE_CONTENT.ordinal else  ITEM_TYPE.ITEM_TYPE_END.ordinal
    }
    class ContentViewHolder :RecyclerView.ViewHolder{
        var tvAltTitle:TextView?=null
        var tvLikeCount:TextView?=null
        var tvAnnotationContent:TextView?=null
        var tvAuthor:TextView?=null
        var tvTime:TextView?=null
        var ivLike:ImageView?=null

        constructor(view:View):super(view){
            tvAltTitle=view.findViewById(R.id.tvAltTitle)
            tvLikeCount=view.findViewById(R.id.tvLikeCount)
            tvAnnotationContent=view.findViewById(R.id.tvAnnotationContent)
            tvAuthor=view.findViewById(R.id.tvAuthor)
            tvTime=view.findViewById(R.id.tvTime)
            ivLike=view.findViewById(R.id.ivLike)
        }
    }

    class EndViewHolder :RecyclerView.ViewHolder{
        var tvEnd:TextView?=null
        constructor(view:View):super(view){
           tvEnd=view.findViewById(R.id.tvEnd)
        }

    }
}
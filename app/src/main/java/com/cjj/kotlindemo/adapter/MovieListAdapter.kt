package com.cjj.kotlindemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.bo.MovieItem
import com.cjj.kotlindemo.interfac.OnItemClickListener

/**
 * Created by chenjiajuan on 2018/5/8.
 */
class MovieListAdapter :RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {
    private var  movieItem:MovieItem ?=null
    private var  context:Context ?=null
    private var onItemClick: OnItemClickListener? = null
    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClick = onItemClickListener
    }
    constructor(context: Context, movieItem: MovieItem) {
        this.context = context
        this.movieItem = movieItem
    }
    override fun onBindViewHolder(holder: MovieViewHolder?, position: Int) {
        var bookItem = movieItem!!.subjects[position]
        holder?.tvMovieName?.text = bookItem.title
        Glide.with(context).load(bookItem?.images?.small)
                .into(holder?.ivMoviePicture)
        holder?.rtNumRaters?.rating = bookItem.rating?.average!!.toFloat()
        holder?.itemView?.setOnClickListener {
            this.onItemClick?.onItemClick(position, bookItem.id)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(context).inflate(R.layout.item_movie_describe, parent, false))
    }

    override fun getItemCount(): Int {
       return if (movieItem !=null){
            movieItem!!.subjects.size
        }else{
              0
        }
    }

    class  MovieViewHolder:RecyclerView.ViewHolder{
        var ivMoviePicture: ImageView? = null
        var tvMovieName: TextView? = null
        var rtNumRaters: RatingBar? = null

        constructor(view: View) : super(view) {
            ivMoviePicture = view.findViewById(R.id.ivMoviePicture)
            tvMovieName = view.findViewById(R.id.tvMovieName)
            rtNumRaters=view.findViewById(R.id.rtNumRaters)

        }
    }
}
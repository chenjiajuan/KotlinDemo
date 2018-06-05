package com.cjj.kotlindemo.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/5/9.
 */
class RatingBar :LinearLayout {
    private var  starCount:Int = 0
    private var  starDrawable:Drawable?=null
    private var starFillDrawable:Drawable?=null
    private var starEmptyDrawable:Drawable?=null
    private var starHalfDrawable:Drawable?=null
    private var mContext:Context ?=null
    private var starImageSize:Int=0
    private var  mLeftMargin:Int=0
    private var  mBottomMargin:Int=0
    private var  mRightMargin:Int=0
    private var  mTopMargin:Int=0


    constructor(context: Context,attrs: AttributeSet?):this(context,attrs,0)
    constructor(context: Context,attrs: AttributeSet?,defStyleAttr: Int):super(context,attrs,defStyleAttr){
        init(context,attrs)
    }


    fun setSatrtCount(count:Int){
        starCount=count
    }

    fun setSartDrawable(drawable: Drawable){
        starDrawable=drawable
    }


    private  fun  init(context: Context,attrs: AttributeSet?){
        var typeArray=context.obtainStyledAttributes(attrs, R.styleable.RatingBarStyle)
        starImageSize= typeArray.getDimension(R.styleable.RatingBarStyle_starImageSize, 20F).toInt()
        starCount=typeArray.getInt(R.styleable.RatingBarStyle_starCount,5)
        starEmptyDrawable=typeArray.getDrawable(R.styleable.RatingBarStyle_starEmptyImage)
        starFillDrawable=typeArray.getDrawable(R.styleable.RatingBarStyle_startFillImage)
        starHalfDrawable=typeArray.getDrawable(R.styleable.RatingBarStyle_starHalfImage)
        mLeftMargin=typeArray.getDimension(R.styleable.RatingBarStyle_starPadding,0F).toInt()
        mRightMargin=typeArray.getDimension(R.styleable.RatingBarStyle_starPadding,0F).toInt()
        mBottomMargin=typeArray.getDimension(R.styleable.RatingBarStyle_starPadding,0F).toInt()
        mTopMargin=typeArray.getDimension(R.styleable.RatingBarStyle_starPadding,0F).toInt()
        typeArray.recycle()
        mContext=context
        setSatrtCount(starCount)
         var  imageView = getStarImageView()
         while (starCount>0){
             starDrawable?.let {
                    var viewGroup= imageView.parent as ViewGroup
                  if (viewGroup!=null){
                     viewGroup.removeAllViews()
                  }
                 imageView.setImageDrawable(it) }
             addView(imageView)
             starCount--
        }
        setStart(4.5F)

    }

    private fun getStarImageView():ImageView{
        var image=ImageView(mContext)
        var layoutParams=LinearLayout.LayoutParams(starImageSize,starImageSize)
        layoutParams.leftMargin=mLeftMargin
        layoutParams.bottomMargin=mBottomMargin
        layoutParams.rightMargin=mRightMargin
        layoutParams.topMargin=mTopMargin
        image.layoutParams=layoutParams
        image.adjustViewBounds=true
        image.scaleType=ImageView.ScaleType.CENTER_CROP
        image.minimumWidth=10
        image.maxHeight=10
        return image
    }

    fun setStart(rating:Float){
        var fint=rating as Int
        (0..fint)
                .map { getChildAt(it) as  ImageView }
                .forEach { it.setImageDrawable(starFillDrawable) }
        (fint..starCount)
                .map { getChildAt(it) as  ImageView }
                .forEach{it.setImageDrawable(starEmptyDrawable)}
    }
}
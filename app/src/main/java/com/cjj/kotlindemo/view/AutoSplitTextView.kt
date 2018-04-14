package com.cjj.kotlindemo.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

/**
 * Created by chenjiajuan on 2018/4/8.
 */
class AutoSplitTextView @JvmOverloads constructor(context: Context, attributeSet: AttributeSet ?= null,
                                                  defStyleAttr: Int = 0):TextView(context,attributeSet,defStyleAttr) {
   private var  textWidth:Float =0.toFloat()
   private var  autoText:String ?=null
   private var  textPaint:Paint ?=null
   private var  mwidth:Int ?=-1

    override fun onDraw(canvas: Canvas) {
        if (mwidth!=width&&autoText!=text.toString()){
            autoText=splitText(this)
            text = autoText
            mwidth=width
        }

        super.onDraw(canvas)
    }
    /**
     * regex 构建正则表达式  http://www.jb51.net/article/130009.htm
     * dropLastWhile 过滤操作 返回从从最后一项起 https://www.cnblogs.com/tgyf/p/6892551.html?utm_source=itdadao&utm_medium=referral
     */

    private fun splitText(textView: AutoSplitTextView): String {
        var charSequence= textView.text
        var originText=charSequence.toString()
        textPaint= textView.paint
        textWidth = (textView.width - textView.paddingLeft - textView.paddingRight).toFloat()
        originText.replace("\n".toRegex(),"")
        var allLines=originText.replace("\r".toRegex(),"").split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var stringBuilder=StringBuilder()

        for (nextLine in allLines){
            //是否超过一行
            if (textPaint!!.measureText(nextLine)<=textWidth){
              stringBuilder.append(nextLine)

            }else{
                var nextLineWidth=0f
                 var i=0
                while (i < nextLine.length){
                    val  textChar=nextLine[i]
                    nextLineWidth +=textPaint!!.measureText(textChar.toString())
                    if (nextLineWidth <=textWidth){
                        stringBuilder.append(textChar)
                    }else{
                        stringBuilder.append("\n")
                        i--
                        nextLineWidth = 0f
                    }
                    i++
                }


                /**
                 *
                for(textChar in nextLine){
                    nextLineWidth +=textPaint!!.measureText(textChar.toString())
                    if (nextLineWidth <=textWidth){
                        stringBuilder.append(textChar)
                    }else{
                        stringBuilder.append("\n")
                        stringBuilder.append(textChar)
                        nextLineWidth=0f
                    }
                }
                nextLine.indices
                        .map { nextLine[it] }
                        .forEach { Log.e("TAG"," textChar : $it") }

                for ((index ,value) in nextLine.withIndex()){
                    Log.e("TAG", " index : $index ,value : $value")
                }

                for (i in 1..5){
                    Log.e("TAG"," i :$i , value : ${nextLine[i]}")
                }

               */

            }
        }
        return stringBuilder.toString()
    }
}
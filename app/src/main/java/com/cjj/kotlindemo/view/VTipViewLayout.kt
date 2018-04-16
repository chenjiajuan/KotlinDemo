package com.cjj.kotlindemo.view

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.RelativeLayout
import android.widget.TextView
import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/9.
 */
class VTipViewLayout @JvmOverloads constructor(
        context: Context, attributeSet: AttributeSet? = null, defstyleAttr: Int = 0)
    : RelativeLayout(context, attributeSet, defstyleAttr) {
    var textTip: TextView
    var mWindow: Window
    var layoutParams: WindowManager.LayoutParams? = null

    /**
     * 你可以在init代码块里面获得构造函数的传参，当然你也可以直接在声明属性的时候获得，
     * @JvmOverloads 如果你没有加上这个注解，它只能重载相匹配的的构造函数，而不是全部。
     */
    init {
        LayoutInflater.from(context).inflate(R.layout.pop_floating_layer, this, true)
        textTip = findViewById(R.id.tv_content_tip)
        mWindow = (context as Activity).window
        layoutParams = mWindow.attributes
        layoutParams?.dimAmount = 0.5f
        layoutParams?.type = WindowManager.LayoutParams.TYPE_APPLICATION
        mWindow.attributes = layoutParams
    }


    fun show(str: String?, viewGroup: ViewGroup) {
        viewGroup.addView(this)
        textTip.text = str
    }


}
package com.cjj.kotlindemo.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/13.
 */
abstract class BaseBarActivity :Activity() {

    var ivBaseBack:ImageView?=null
    var tvBaseName:TextView?=null
    var rlContent:RelativeLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_bar)
        ivBaseBack=findViewById(R.id.ivBaseBack)
        rlContent=findViewById(R.id.rlContent)
        tvBaseName=findViewById(R.id.tvBaseName)
        ivBaseBack?.setOnClickListener(View.OnClickListener {
           this.finish()
        })
        setTile(tvBaseName!!)
        setContent(rlContent!!)

    }
    abstract fun setTile(text:TextView)
    abstract fun setContent(rlContent:RelativeLayout)
}
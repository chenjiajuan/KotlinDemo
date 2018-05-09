package com.cjj.kotlindemo.activity

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/13.
 */
abstract class BaseBarActivity : Activity() {

    private var ivBaseBack: ImageView? = null
    private var tvBaseName: TextView? = null
    private var rlContent: RelativeLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_bar)
        ivBaseBack = findViewById(R.id.ivBaseBack)
        rlContent = findViewById(R.id.rlContent)
        tvBaseName = findViewById(R.id.tvBaseName)
        ivBaseBack?.setOnClickListener({
            this.finish()
        })
        setContent(rlContent!!)
        setTile(tvBaseName!!)

    }

    abstract fun setTile(text: TextView)
    abstract fun setContent(rlContent: RelativeLayout)
}
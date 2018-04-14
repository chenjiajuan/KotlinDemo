package com.cjj.kotlindemo

import android.app.Activity
import android.os.Bundle
import com.cjj.kotlindemo.interfac.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button().click()
        Button().showOff()
    }
}

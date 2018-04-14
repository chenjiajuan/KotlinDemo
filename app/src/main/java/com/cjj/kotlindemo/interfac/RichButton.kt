package com.cjj.kotlindemo.interfac

 open class RichButton :Clickable {
    fun disable(){}
     open fun animate(){}
    final   override fun click() {
    }

}
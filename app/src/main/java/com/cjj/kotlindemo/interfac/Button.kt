package com.cjj.kotlindemo.interfac

class Button:Clickable,Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }


    override fun click() {
        println("I was Clicked")
    }
}
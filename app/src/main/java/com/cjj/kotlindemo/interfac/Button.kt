package com.cjj.kotlindemo.interfac

import java.sql.DriverManager.println


class Button : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }


    override fun click() {
        println("I was Clicked")
    }
}
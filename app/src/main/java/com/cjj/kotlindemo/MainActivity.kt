package com.cjj.kotlindemo

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import com.cjj.kotlindemo.view.VTipViewLayout
import com.cjj.kotlindemo.lastChar3 as last

class MainActivity : Activity() {
    private var tvFirst:TextView ?=null
    private var viewGroup:FrameLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFirst=findViewById(R.id.tv_tip)
        viewGroup=findViewById(R.id.viewGroupLayout)
        tvFirst!!.text="Hello World !!!!!!"
        tvFirst!!.setTextColor(Color.BLUE)
        tvFirst!!.setOnClickListener({
            Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
            var intent=Intent(this,ListActivity::class.java)
            this.startActivity(intent)
        })

        //函数调用
        testOne()
        //默认参数
        testTwo()
        //调用顶层函数
        testThree()
        //扩展函数
        testFourth()
        //非空断言
        strLen("kill")
        //添加视图
        addView(viewGroup)

    }

    private fun addView(viewGroup: FrameLayout?) {
        var  vTioView=VTipViewLayout(this)
        //非空断言，如果为空的话，此处抛出异常
        vTioView.show("测试啦啦啦", viewGroup!!)

    }

    fun strLen(s:String?)=s!!.length

    private fun testFourth() {
        println("Hello Kotlin ".lastChar())
        println("Hello Kotlin ".lastChar2())
        println("Hello Kotlin ".last())
    }

    private fun testThree() {
        var  list= listOf("A","B","C")
        println(joinToString3(list))
    }

    private fun testTwo() {
        var  list= listOf(1,2,3)
       println(joinToString2(list))
    }

    private fun testOne() {
        var  list= listOf(1,2,3)
        var array= arrayListOf(1,2,3)
        var arrayString= arrayListOf("1","2","3")
        var map= mapOf(0 to "1",2 to "3")
        var map2= mapOf<Int,String>()
        println("===============")
        println(map.size)
        for ( i in map.entries){
            println("map : i = $ ,${map[0]}")

        }
        println("===============")
        for ((i,value) in map){
            println("map2 : i = $i ,value = $value")
        }
        println("===============")
        var  hashMap= hashMapOf(0 to "ABC",1 to "DEF")
        for ((index ,value) in hashMap){
            println("map2 : i = $index ,value = $value")
        }
        hashMap.put(1,"啦啦啦")
        println("===============")
        for ((index ,value) in hashMap){
            println("map2 : i = $index ,value = $value")
        }
        println("===============")
        println(joinToString(list,";","(",")"))
        println(joinToString(list,separator = ";",prefix = "(",postfix = ")"))
    }

    fun  <T> joinToString(
            collection:Collection<T>,
            separator:String,
            prefix:String,
            postfix:String
    ):String{
        var result=StringBuilder(prefix)
        for ((index,value) in collection.withIndex()){
              if (index>0)
                result.append(separator)
                result.append(value)
        }
        result.append(postfix)
        return result.toString()
    }

    fun  <T> joinToString2(
            collection:Collection<T>,
            separator:String=",",
            prefix:String="(",
            postfix:String=")"
    ):String{
        var result=StringBuilder(prefix)
        for ((index,value) in collection.withIndex()){
            if (index>0)
                result.append(separator)
            result.append(value)
        }
        result.append(postfix)
        return result.toString()
    }
}

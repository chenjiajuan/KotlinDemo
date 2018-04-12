package com.cjj.kotlindemo.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import com.alibaba.fastjson.JSON
import com.cjj.kotlindemo.R
import com.cjj.kotlindemo.bo.BookDetail
import com.cjj.kotlindemo.bo.BookItem
import com.cjj.kotlindemo.fragment.AreaFragment
import com.cjj.kotlindemo.fragment.PicturnFragment
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import okhttp3.*
import java.io.IOException

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var toggle :ActionBarDrawerToggle?=null
    var mPictureFragment:PicturnFragment ?=null
    var mAreaFragment:AreaFragment?=null
//    var url:String ="https://api.douban.com/v2/book/1220562"
//    var url:String ="https://www.douban.com/service/auth2/auth"
    //537096553806
    val host = "https://acs.m.taobao.com/gw/mtop.taobao.detail.getdetail/6.0/?data="
    val tag = "%7B%22itemNumId%22%3A%22"
    val tag2 = "%22%2C%22detail_v%22%3A%223.1.0%22%7D"
//    val url = host + tag + "537096553806" + tag2 + "&ttid=142857@taobao_iphone_7.10.3"
//    val url = "https://api.douban.com/v2/book/search"
    val url = "https://api.douban.com/v2/book/search?q=悲惨世界&count=2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        toggle= ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close)
        drawerLayout?.addDrawerListener(toggle!!)
        toggle?.syncState()
        navigationMain.setCheckedItem(R.id.nav_menu_area)
        navigationMain.setNavigationItemSelectedListener(this)
        showArea()
        //initData()
        initGetRequestData()
    }

    private fun initGetRequestData() {
       var okphht=OkHttpClient()
        var builder=Request.Builder().get().url(url)
        var  request=builder.build()
        var call=okphht.newCall(request)
        call.enqueue(object : Callback{
            override fun onFailure(call: Call?, e: IOException?) {

            }

            override fun onResponse(call: Call?, response: Response?) {
                var  string=response?.body()?.string()
                var data=JSON.parseObject(string,BookItem::class.java)
                Log.e("TAG","data : "+data.books.toString())
            }

        })
    }

    private fun initData() {
        var okhttp=OkHttpClient()
        var builder=Request.Builder().url(url)
         var request=builder.build()
        var call=okhttp.newCall(request)
         call.enqueue(object :Callback{
             override fun onFailure(call: Call?, e: IOException?) {
             }

             override fun onResponse(call: Call?, response: Response?) {
                 var json=response?.body()?.string()
                 Log.e("TAG",json)
             }

         })

    }

    private fun showArea() {
        val supportFragmentManager=supportFragmentManager
        val  fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fl_main_content,AreaFragment.newInstance())
        fragmentTransaction.commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val fragmentTransaction=supportFragmentManager.beginTransaction()
        hideAllFragment(fragmentTransaction)
        when (item.itemId){
            R.id.nav_menu_picture -> {
                mPictureFragment?.let {
                    fragmentTransaction.show(it)
                } ?:PicturnFragment.newInstance().let {
                    mPictureFragment=it
                    fragmentTransaction.replace(R.id.fl_main_content,mPictureFragment,"picture")
                    fragmentTransaction.show(it)
                }
            }
            R.id.nav_menu_area -> {
                mAreaFragment?.let {
                    fragmentTransaction.show(it)
                }?:AreaFragment.newInstance().let {
                    mAreaFragment=it
                    fragmentTransaction.replace(R.id.fl_main_content,mAreaFragment,"area")
                    fragmentTransaction.show(it)
                }
            }
        }
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        return true
    }

    private fun hideAllFragment(fragmentTransaction: FragmentTransaction?) {
        mAreaFragment?.let {
            fragmentTransaction?.hide(it)
        }
        mPictureFragment?.let {
            fragmentTransaction?.hide(it)
        }
    }

}


package com.cjj.kotlindemo

import android.app.Activity
import android.graphics.Rect
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class ListActivity : Activity() {

    var itemList:ArrayList<Item>?= arrayListOf()
    var ryListView:RecyclerView ?=null
    var listAdapter:ListAdapter ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liat)
        ryListView=findViewById(R.id.ry_list)

        var  item=Item()
        item.name="加湿器"
        item.url="http://img.alicdn.com/imgextra/i1/6000000001128/TB22x5ueEvMR1JjSZPcXXc1tFXa_!!6000000001128-0-imgsearch_baichuan.jpg"
        for (i in 0..10){
            itemList?.add(item)
        }
        listAdapter= ListAdapter(this,itemList!!)
        ryListView?.adapter=listAdapter
        ryListView?.addItemDecoration(SpacesItemDecoration(16))
        ryListView?.layoutManager=LinearLayoutManager(this)
    }

    class SpacesItemDecoration(var space: Int = 16) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
            outRect?.left = space
            outRect?.right = space
            outRect?.bottom = space
            if (parent?.getChildAdapterPosition(view) == 0) {
                outRect?.top = 12
            }
        }

    }
}

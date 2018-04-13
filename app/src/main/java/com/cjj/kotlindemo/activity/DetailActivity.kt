package com.cjj.kotlindemo.activity

import android.app.Activity
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.*
import com.cjj.kotlindemo.R

/**
 * Created by chenjiajuan on 2018/4/12.
 */
class DetailActivity :Activity() {

    var webViewDetail:WebView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        webViewDetail=findViewById(R.id.webViewDetail)
        initWebView()
    }

    private fun initWebView() {
        var webSettings=webViewDetail?.settings
        webSettings?.javaScriptEnabled=true //支持js
        webSettings?.builtInZoomControls=false  //不使用内置的缩放控件
        webSettings?.javaScriptCanOpenWindowsAutomatically=true //支持js打开新窗口
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            webSettings?.mediaPlaybackRequiresUserGesture=false
        }
        webSettings?.useWideViewPort=true //自适应
        webSettings?.loadWithOverviewMode=true //网页或图片充满屏幕
        webSettings?.domStorageEnabled=true //设置存储模式
        webSettings?.loadsImagesAutomatically=true //设置自动加载图片
        webViewDetail?.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        webViewDetail?.webChromeClient= WebChromeClient()
        webViewDetail?.setWebViewClient(object:WebViewClient(){
            override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse {
                return super.shouldInterceptRequest(view, request)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }
        })

    }
}
package com.example.day22;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Main3Activity extends Activity {

    private ImageView iv;
    private TextView tv;
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
    }

    private void initView() {
        iv = (ImageView) findViewById(R.id.iv);
        tv = (TextView) findViewById(R.id.tv);
        web = (WebView) findViewById(R.id.web);
        initData();
    }

    private void initData() {
        Intent intent = getIntent();
        String image = intent.getStringExtra("image");
        String desc = intent.getStringExtra("desc");
        String name = intent.getStringExtra("name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        RequestOptions requestOptions = new RequestOptions().circleCrop();
        Glide.with(Main3Activity.this).applyDefaultRequestOptions(requestOptions).load(image).into(iv);
        tv.setText(desc);
        web = (WebView) findViewById(R.id.web);
        web.setWebChromeClient(new WebChromeClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        web.loadUrl("https://www.baidu.com/s?tn=80035161_2_dg&wd=%E7%99%BE%E5%BA%A6");
    }
}

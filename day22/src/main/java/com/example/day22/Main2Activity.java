package com.example.day22;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements XiangRecyAdapter.OnItemClick {

    private List<GsonBean.HxListBeansBean> list = new ArrayList<>();
    private RecyclerView rv;
    private XiangRecyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        initData();
    }

    private void initData() {
        Intent intent = getIntent();
        List<GsonBean.HxListBeansBean> data = (List<GsonBean.HxListBeansBean>) intent.getSerializableExtra("data");
        list.addAll(data);
        adapter.notifyDataSetChanged();
    }

    private void initView() {
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adapter = new XiangRecyAdapter(list);
        adapter.setOnItemClick(this);
        rv.setAdapter(adapter);
    }

    @Override
    public void onitemclick(int position, GsonBean.HxListBeansBean bean) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        intent.putExtra("image", bean.getShop_image_url());
        intent.putExtra("desc", bean.getShop_title());
        startActivity(intent);
    }


    private long lastPlayTime = -1l;//上一次点击的时间
    private long duration = 0l;//总时长

    @Override
    protected void onResume() {
        super.onResume();
        tryToAddTimes();
    }

    @Override
    protected void onStop() {
        super.onStop();
        tryToAddTimes();
        lastPlayTime = -1l;
    }

    public void createView(Activity activity) {
        View floatView = LayoutInflater.from(activity).inflate(R.layout.play_time_view, null);
        FrameLayout play_time_header = floatView.findViewById(R.id.play_time_header);
        play_time_header.setOnTouchListener(new View.OnTouchListener() {//这个的作用是给页面添加一个遮罩，通过点击来改变时间
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        tryToAddTimes();
                        break;
                }
                return false;
            }
        });
        Window window = activity.getWindow();
        window.addContentView(play_time_header, new WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT));
    }

    //用于计算时间
    public void tryToAddTimes() {
        if (lastPlayTime <= 0) {//第一次进入游戏更新时间
            lastPlayTime = System.currentTimeMillis();
            return;
        }
        long currentTime = System.currentTimeMillis();
        long timeDiff = currentTime - lastPlayTime;
        if (timeDiff > 1) {//若挂机时长超过25000,则最多时长加25000
            duration += 1;
        } else {//若不超过挂机时长,则添加正常时长
            duration += timeDiff;
        }
        lastPlayTime = currentTime;//更新上次点击的时间
    }
}

package com.example.day22;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day22.P.ImPresenter;
import com.example.day22.V.MvpView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MvpView, TopRecyAdapter.OnItemClick {

    private RecyclerView rv1;
    private RecyclerView rv2;
    private TopRecyAdapter adapter;
    private List<GsonBean.HxListBeansBean> list = new ArrayList<>();
    private ImPresenter imPresenter;
    private BottomRecyAdapter adapter1;
    private List<GsonBean.HxListBeansBean> hxListBeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView1();
        initView2();
    }

    private void initView2() {
        rv2 = (RecyclerView) findViewById(R.id.rv2);
        rv2.setLayoutManager(new LinearLayoutManager(this));
        rv2.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adapter1 = new BottomRecyAdapter(list);
        rv2.setAdapter(adapter1);
        initData();
    }

    //列表布局
    private void initView1() {
        rv1 = (RecyclerView) findViewById(R.id.rv1);
        rv1.setLayoutManager(new GridLayoutManager(this, 3));
        rv1.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adapter = new TopRecyAdapter(list);
        adapter.setOnItemClick(this);
        rv1.setAdapter(adapter);
        initData();
    }

    private void initData() {
        imPresenter = new ImPresenter(this);
        imPresenter.getHome();
    }

    @Override
    public void OnChengGong(GsonBean gsonBean) {
        hxListBeans = gsonBean.getHxListBeans();
        list.addAll(hxListBeans);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void OnShiBai(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onitemclick(int position, GsonBean.HxListBeansBean bean) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", (Serializable) hxListBeans);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}

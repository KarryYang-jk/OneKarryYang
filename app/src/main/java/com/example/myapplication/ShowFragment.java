package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowFragment extends Fragment {


    private RecyclerView rv;
    private ShowRecyAdapter adapter;
    private List<Person> list = new ArrayList<>();
    private String url = "http://www.qubaobei.com//ios//cf//uploadfile//132//11//10191.jpg";
    private long insert;

    public ShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rv = view.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        adapter = new ShowRecyAdapter(list);
        rv.setAdapter(adapter);
        initData();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            Person person = new Person();
            person.setId(Long.valueOf(i));
            person.setFood("麻婆豆腐" + i);
            person.setImagePath(url);
            insert = DbUtil.getDbUtil().insert(person);
        }
        if (insert >= 0) {
            Toast.makeText(getContext(), "插入成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "插入失败", Toast.LENGTH_SHORT).show();
        }
        List<Person> people = DbUtil.getDbUtil().queryAll();
        list.addAll(people);
        adapter.notifyDataSetChanged();
    }
}

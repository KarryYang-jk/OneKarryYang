package com.example.day22.callback;

import com.example.day22.GsonBean;

public interface MvpCallBack {
    void OnChengGong(GsonBean gsonBean);

    void OnShiBai(String error);
}

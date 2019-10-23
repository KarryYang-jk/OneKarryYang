package com.example.day22.V;

import com.example.day22.GsonBean;

public interface MvpView {
    void OnChengGong(GsonBean gsonBean);

    void OnShiBai(String error);
}

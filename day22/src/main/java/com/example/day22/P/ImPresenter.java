package com.example.day22.P;

import com.example.day22.GsonBean;
import com.example.day22.M.ImMvpModel;
import com.example.day22.V.MvpView;
import com.example.day22.callback.MvpCallBack;

public class ImPresenter implements Presenter, MvpCallBack {
    private MvpView mvpView;
    private final ImMvpModel imMvpModel;

    public ImPresenter(MvpView mvpView) {
        this.mvpView = mvpView;
        imMvpModel = new ImMvpModel();
    }

    @Override
    public void getHome() {
        if (imMvpModel != null) {
            imMvpModel.getList(this);
        }
    }

    @Override
    public void OnChengGong(GsonBean gsonBean) {
        if (mvpView != null) {
            mvpView.OnChengGong(gsonBean);
        }
    }

    @Override
    public void OnShiBai(String error) {
        if (mvpView != null) {
            mvpView.OnShiBai(error);
        }
    }
}

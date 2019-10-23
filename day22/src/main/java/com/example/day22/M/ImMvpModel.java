package com.example.day22.M;

import com.example.day22.ApiService;
import com.example.day22.GsonBean;
import com.example.day22.callback.MvpCallBack;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImMvpModel implements MvpModel {
    @Override
    public void getList(final MvpCallBack callBack) {
        ApiService apiService = new Retrofit.Builder().baseUrl(ApiService.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(ApiService.class);
        Observable<GsonBean> data = apiService.getData();
        data.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GsonBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GsonBean gsonBean) {
                        callBack.OnChengGong(gsonBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.OnShiBai("失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

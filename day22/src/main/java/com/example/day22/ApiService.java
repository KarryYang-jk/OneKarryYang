package com.example.day22;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    //http://106.13.63.54:8080/sys/qm02a.json
    String baseUrl = "http://106.13.63.54:8080/sys/";

    @GET("qm02a.json")
    Observable<GsonBean> getData();
}

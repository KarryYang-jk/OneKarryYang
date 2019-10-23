package com.example.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    //http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=20&page=1

    String baseUrl = "http://www.qubaobei.com/ios/cf/";


    @GET("dish_list.php")
    Observable<GsonBean> getQuery(@Query("stage_id") int stage_id, @Query("limit") int limit, @Query("page") int page);
}

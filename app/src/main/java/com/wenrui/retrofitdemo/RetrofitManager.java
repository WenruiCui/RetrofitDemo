package com.wenrui.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/9
 */
class RetrofitManager {

    private static final RetrofitManager ourInstance = new RetrofitManager();

    private RetrofitApi retrofitApi;

    private RetrofitManager() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();

        retrofitApi = retrofit.create(RetrofitApi.class);
    }

    static RetrofitManager getInstance() {
        return ourInstance;
    }

    public RetrofitApi getRetrofitApi() {
        return retrofitApi;
    }
}

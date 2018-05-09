package com.wenrui.retrofitdemo;

import com.wenrui.retrofitdemo.bean.LatestBean;
import com.wenrui.retrofitdemo.bean.NewsItemBean;
import com.wenrui.retrofitdemo.bean.SoftVersion;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/9
 */
public interface RetrofitApi {

    @GET("version/android/{version}")
    Observable<Result<SoftVersion>> getVersionMsg(@Path("version") String version);

    @GET("news/latest")
    Observable<Result<LatestBean>> getLastList();

    @GET("news/{id}")
    Call<NewsItemBean> getNewsItem(@Path("id") int id);

}

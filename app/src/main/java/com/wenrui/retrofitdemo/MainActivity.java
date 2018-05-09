package com.wenrui.retrofitdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.wenrui.retrofitdemo.bean.SoftVersion;
import com.wenrui.retrofitdemo.databinding.MainDataBinding;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.adapter.rxjava2.Result;

public class MainActivity extends AppCompatActivity {

    private MainDataBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
    }

    private void initView() {
        mainBinding.button.setOnClickListener(view -> onClickVersion());
    }


    //TODO:动态请求网络权限
    public void onClickVersion() {
        RetrofitManager.getInstance().getRetrofitApi().getVersionMsg("2.1.3")
            .subscribeOn(Schedulers.io())
            .subscribe(new Observer<Result<SoftVersion>>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(Result<SoftVersion> value) {
                    if (value.isError() && value.error() != null) {
                        Log.e("TTT", value.error().toString());
                        return;
                    }
                    Response<SoftVersion> softVersion = value.response();
                }

                @Override
                public void onError(Throwable e) {
                    Log.e("TTT", e.toString());
                }

                @Override
                public void onComplete() {
                    Log.e("TTT", "complete");
                }
            });
    }

    public void onClickItem(View view) {

    }

    public void onClickNews(View view) {
    }
}

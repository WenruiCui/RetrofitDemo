package com.wenrui.retrofitdemo.bean;

import com.google.gson.annotations.SerializedName;

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/9
 */
public class SoftVersion {

    @SerializedName("status")
    private int status;
    @SerializedName("msg")
    private String msg;
    @SerializedName("latest")
    private String latest;

    public SoftVersion() {
        status = -1;
        msg = "";
        latest = "";
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }
}

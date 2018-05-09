package com.wenrui.retrofitdemo.bean;

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/9
 *
 * 新闻额外信息
 * URL: https://news-at.zhihu.com/api/4/story-extra/#{id}
 */
public class ItemExtraBean {

    /**
     * long_comments : 0
     * popularity : 161
     * short_comments : 19
     * comments : 19
     */

    private int long_comments;
    private int popularity;
    private int short_comments;
    private int comments;

    public int getLong_comments() {
        return long_comments;
    }

    public void setLong_comments(int long_comments) {
        this.long_comments = long_comments;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getShort_comments() {
        return short_comments;
    }

    public void setShort_comments(int short_comments) {
        this.short_comments = short_comments;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}

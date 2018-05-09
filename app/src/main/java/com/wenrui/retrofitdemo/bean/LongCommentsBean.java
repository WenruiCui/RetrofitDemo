package com.wenrui.retrofitdemo.bean;

import java.util.List;

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/9
 *
 * 新闻对应长评论查看
 * URL: https://news-at.zhihu.com/api/4/story/8997528/long-comments
 */
public class LongCommentsBean {

    private List<CommentsEntity> comments;

    public List<CommentsEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentsEntity> comments) {
        this.comments = comments;
    }

    public static class CommentsEntity {

        /**
         * author : 巨型黑娃儿
         * content : 也不算逻辑问题。其实小时候刚刚听说这个玩意的时候我也奇...
         * avatar : http://pic3.zhimg.com/4131a3385c748c9e2d02ab80e29a0c52_im.jpg
         * time : 1479706360
         * reply_to : {"content":"第二个机灵抖的还是有逻辑问题，不该说忘了，应该说没喝过啊我也不知道","status":0,"id":27275308,"author":"2233155495"}
         * id : 27276057
         * likes : 2
         */

        private String author;
        private String content;
        private String avatar;
        private int time;
        private ReplyToEntity reply_to;
        private int id;
        private int likes;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public ReplyToEntity getReply_to() {
            return reply_to;
        }

        public void setReply_to(ReplyToEntity reply_to) {
            this.reply_to = reply_to;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public static class ReplyToEntity {

            /**
             * content : 第二个机灵抖的还是有逻辑问题，不该说忘了，应该说没喝过啊我也不知道
             * status : 0
             * id : 27275308
             * author : 2233155495
             */

            private String content;
            private int status;
            private int id;
            private String author;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }
        }
    }
}

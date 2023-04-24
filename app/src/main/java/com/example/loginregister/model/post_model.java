package com.example.loginregister.model;

import java.io.Serializable;

public class post_model implements Serializable {
    int user_img;
    String user_name;
    String post_desc;
    int post_img;

    public post_model(int user_img, String user_name, String post_desc, int post_img) {
        this.user_img = user_img;
        this.user_name = user_name;
        this.post_desc = post_desc;
        this.post_img = post_img;
    }

    public int getUser_img() {
        return user_img;
    }

    public void setUser_img(int user_img) {
        this.user_img = user_img;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPost_desc() {
        return post_desc;
    }

    public void setPost_desc(String post_desc) {
        this.post_desc = post_desc;
    }

    public int getPost_img() {
        return post_img;
    }

    public void setPost_img(int post_img) {
        this.post_img = post_img;
    }

}

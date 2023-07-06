package com.example.login_sample;

public class japanItem {
    String name;
    int resid;


    public japanItem(String name) {
        this.name = name;
    }
    public japanItem(String name, int resid) {
        this.name = name;
        this.resid = resid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {

        this.resid = resid;
    }
}


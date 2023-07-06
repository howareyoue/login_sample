package com.example.login_sample;

public class usaItem {
    String name;
    int resid;


    public usaItem(String name) {
        this.name = name;
    }
    public usaItem(String name, int resid) {
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


package com.example.administrator.mvpdemo.mvp.bean;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MvpEntity {
    private String msg;
    public MvpEntity(){}
    public MvpEntity(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

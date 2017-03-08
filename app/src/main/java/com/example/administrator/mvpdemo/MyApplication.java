package com.example.administrator.mvpdemo;

import android.app.Application;
import android.content.Context;

import com.example.administrator.mvpdemo.di.compoent.DaggerMyApplicationComponent;
import com.example.administrator.mvpdemo.di.compoent.MyApplicationComponent;
import com.example.administrator.mvpdemo.di.module.MyApplicationModule;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MyApplication extends Application {
    private static MyApplicationComponent component;
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        initInject();
    }

    private void initInject() {
        component = DaggerMyApplicationComponent.builder().myApplicationModule(new MyApplicationModule(this)).build();
    }
    public static Context getContext(){
        return mContext;
    }
    public static MyApplicationComponent getApplication(){
        return  component;
    }

}

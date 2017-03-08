package com.example.administrator.mvpdemo.di.module;

import android.content.Context;

import com.example.administrator.mvpdemo.MyApplication;
import com.example.administrator.mvpdemo.scope.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/7.
 */
@Module
public class MyApplicationModule {
    private MyApplication myApplication;
    public  MyApplicationModule(MyApplication myApplication){
        this.myApplication = myApplication;
    }
    @Provides
    @Singleton
    public MyApplication providesApplication(){
        return  myApplication;
    }
    @Provides
    @ForApplication
    Context providesContext(){
        return myApplication;
    }


}

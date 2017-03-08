package com.example.administrator.mvpdemo.di.module;

import com.example.administrator.mvpdemo.bean.Info;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/8.
 */
@Module
public class InfoModule {
    @Provides
    Info providesInfoModule(){
        return new Info("你好请查收");
    }
}

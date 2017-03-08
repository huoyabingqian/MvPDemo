package com.example.administrator.mvpdemo.di.module;

import com.example.administrator.mvpdemo.bean.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/8.
 */
@Module
public class UserModule {
    @Provides
    User providesUserModule(){
        return new User();
    }
}

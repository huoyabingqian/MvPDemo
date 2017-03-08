package com.example.administrator.mvpdemo.di.compoent;

import com.example.administrator.mvpdemo.MyApplication;
import com.example.administrator.mvpdemo.di.module.MyApplicationModule;
import com.example.administrator.mvpdemo.di.scope.PreApp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/7.
 */
@PreApp
@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    MyApplication app();
}

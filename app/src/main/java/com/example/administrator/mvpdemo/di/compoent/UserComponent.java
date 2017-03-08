package com.example.administrator.mvpdemo.di.compoent;

import com.example.administrator.mvpdemo.di.module.UserModule;
import com.example.administrator.mvpdemo.di.scope.PreApp;
import com.example.administrator.mvpdemo.mvp.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/8.
 */
@PreApp
@Component(modules = UserModule.class,dependencies = InfoComponent.class)
public interface UserComponent {
    void inject(MainActivity mainActivity);
}

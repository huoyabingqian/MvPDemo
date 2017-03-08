package com.example.administrator.mvpdemo.di.compoent;

import com.example.administrator.mvpdemo.di.module.MvpModulePresenter;
import com.example.administrator.mvpdemo.di.scope.PreApp;
import com.example.administrator.mvpdemo.mvp.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/8.
 */
@PreApp
@Singleton
@Component(modules = MvpModulePresenter.class)
public interface MvpComponent {
    void inject(MainActivity activity);

}

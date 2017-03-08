package com.example.administrator.mvpdemo.di.compoent;

import com.example.administrator.mvpdemo.di.module.ActivityMoudle;
import com.example.administrator.mvpdemo.mvp.ui.activity.MainActivity;
import com.example.administrator.mvpdemo.mvp.ui.activity.WebActivity;
import com.example.administrator.mvpdemo.mvp.ui.base.BaseActivity;
import com.example.administrator.mvpdemo.scope.ActivityScope;


import dagger.Component;

/**
 * Created by Administrator on 2017/3/7.
 */
@ActivityScope
@Component(dependencies = MyApplicationComponent.class,modules = ActivityMoudle.class)
public interface ActivityComponent {
 void inject(MainActivity mainActivity);
    void inject(WebActivity webActivity);
    void inject(BaseActivity guideActivity);
}

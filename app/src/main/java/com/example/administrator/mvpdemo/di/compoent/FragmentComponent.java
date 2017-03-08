package com.example.administrator.mvpdemo.di.compoent;

import com.example.administrator.mvpdemo.di.module.ActivityMoudle;
import com.example.administrator.mvpdemo.di.module.FragmentModule;
import com.example.administrator.mvpdemo.mvp.ui.fragment.GuideFragment;
import com.example.administrator.mvpdemo.mvp.ui.fragment.HomePageFragment;
import com.example.administrator.mvpdemo.mvp.ui.fragment.SplashFragment;
import com.example.administrator.mvpdemo.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/7.
 */
@ActivityScope
@Component(modules = {FragmentModule.class, ActivityMoudle.class},dependencies = MyApplicationComponent.class)
public interface FragmentComponent {
    void inject(GuideFragment guideFragment);
    void inject(HomePageFragment homePageFragment);
    void inject(SplashFragment splashFragment);
}

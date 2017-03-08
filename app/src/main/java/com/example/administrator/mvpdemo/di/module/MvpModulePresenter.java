package com.example.administrator.mvpdemo.di.module;

import com.example.administrator.mvpdemo.di.scope.PreApp;
import com.example.administrator.mvpdemo.mvp.module.module.MvpModule;
import com.example.administrator.mvpdemo.mvp.presenter.MvpPresenter;
import com.example.administrator.mvpdemo.mvp.ui.activity.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/8.
 */
@PreApp
@Module
public class MvpModulePresenter {

    private MainActivity mainActivity;
    public MvpModulePresenter( MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
    @Provides
    MainActivity providesActivity(){
        return mainActivity;
    }
    @Provides
    MvpPresenter provideMvpPresenter(MainActivity activity, MvpModule mvpModule){
        return new MvpPresenter(activity,mvpModule);
    }
    @Provides
    MvpModule providesMvpModule(){
        return new MvpModule();
    }
}

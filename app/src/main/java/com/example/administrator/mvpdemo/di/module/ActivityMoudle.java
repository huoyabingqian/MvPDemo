package com.example.administrator.mvpdemo.di.module;

import android.content.Context;
import com.example.administrator.mvpdemo.mvp.ui.base.BaseActivity;
import com.example.administrator.mvpdemo.scope.ForActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/7.
 */
@Module
public class ActivityMoudle {
    private BaseActivity mActivity;
    public ActivityMoudle(BaseActivity activity){
        this.mActivity = activity;
    }
    @Provides
    BaseActivity providesActivity(){
        return mActivity;
    }

    @Provides
    @ForActivity
    Context provideContext(){
        return mActivity;
    }
}

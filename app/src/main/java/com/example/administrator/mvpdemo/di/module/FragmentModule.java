package com.example.administrator.mvpdemo.di.module;

import android.content.Context;

import com.example.administrator.mvpdemo.mvp.ui.base.BaseFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/7.
 */
@Module
public class FragmentModule {
    private BaseFragment baseFragment;
    public FragmentModule(BaseFragment baseFragment){
        this.baseFragment = baseFragment;
    }
    @Provides
    @Singleton
    BaseFragment provideFragment(){
        return baseFragment;
    }
    @Provides
    Context provideContext(){
        return baseFragment.getContext();
    }

}

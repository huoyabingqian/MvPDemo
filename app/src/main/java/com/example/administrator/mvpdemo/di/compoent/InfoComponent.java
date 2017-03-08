package com.example.administrator.mvpdemo.di.compoent;

import com.example.administrator.mvpdemo.bean.Info;
import com.example.administrator.mvpdemo.di.module.InfoModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/8.
 */
@Component(modules = InfoModule.class)
public interface InfoComponent {
    Info inFo();
}

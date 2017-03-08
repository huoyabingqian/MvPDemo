package com.example.administrator.mvpdemo.mvp.module.module;

import com.example.administrator.mvpdemo.mvp.bean.MvpEntity;
import com.example.administrator.mvpdemo.mvp.module.impl.MvpModuleImpl;

/**
 * Created by Administrator on 2017/3/8.
 */

public class MvpModule implements MvpModuleImpl {
    @Override
    public MvpEntity test() {
        return new MvpEntity("处理数据返回");
    }
}

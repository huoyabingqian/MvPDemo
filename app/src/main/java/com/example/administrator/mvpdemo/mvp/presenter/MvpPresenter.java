package com.example.administrator.mvpdemo.mvp.presenter;

import com.example.administrator.mvpdemo.mvp.bean.MvpEntity;
import com.example.administrator.mvpdemo.mvp.module.impl.MvpModuleImpl;
import com.example.administrator.mvpdemo.mvp.module.module.MvpModule;
import com.example.administrator.mvpdemo.mvp.ui.impl.MvpImpl;

/**
 * Created by Administrator on 2017/3/8.
 */

public class MvpPresenter {
    MvpImpl mvp;
    MvpModuleImpl mvpImpl;
    public MvpPresenter(MvpImpl mvp,MvpModuleImpl mvpImpl){
        this.mvp = mvp;
        this.mvpImpl = mvpImpl;
    }
public void testDo(){
    MvpEntity entity = mvpImpl.test();
    mvp.showTest(entity.getMsg());

}
}

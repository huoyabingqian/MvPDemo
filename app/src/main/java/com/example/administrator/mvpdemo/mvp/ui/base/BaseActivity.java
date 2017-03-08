package com.example.administrator.mvpdemo.mvp.ui.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mvpdemo.MyApplication;
import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.di.compoent.ActivityComponent;
import com.example.administrator.mvpdemo.di.module.ActivityMoudle;

public abstract class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public ActivityComponent getActivityComponent(){
        if (activityComponent == null){


        }
        return activityComponent;
    }

}

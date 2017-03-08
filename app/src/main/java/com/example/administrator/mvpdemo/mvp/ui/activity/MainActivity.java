package com.example.administrator.mvpdemo.mvp.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.di.compoent.DaggerMvpComponent;
import com.example.administrator.mvpdemo.di.compoent.MvpComponent;
import com.example.administrator.mvpdemo.di.module.MvpModulePresenter;
import com.example.administrator.mvpdemo.mvp.presenter.MvpPresenter;
import com.example.administrator.mvpdemo.mvp.ui.base.BaseActivity;
import com.example.administrator.mvpdemo.mvp.ui.impl.MvpImpl;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MvpImpl{
    @BindView(R.id.tv)
    TextView tv;
    @Inject
    MvpPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MvpComponent component = DaggerMvpComponent.builder().mvpModulePresenter(new MvpModulePresenter(this)).build();
        component.inject(this);
    }

    @Override
    public void showTest(String msg) {
        tv.setText(msg);
    }
    @OnClick(R.id.tv)
    public void setOnclick(View view){
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.testDo();
            }
        });
    }
}

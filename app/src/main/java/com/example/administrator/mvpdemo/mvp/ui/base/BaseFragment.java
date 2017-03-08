package com.example.administrator.mvpdemo.mvp.ui.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.mvpdemo.MyApplication;
import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.di.compoent.DaggerFragmentComponent;
import com.example.administrator.mvpdemo.di.compoent.FragmentComponent;
import com.example.administrator.mvpdemo.di.module.ActivityMoudle;
import com.example.administrator.mvpdemo.di.module.FragmentModule;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    private FragmentComponent fragmentComponent;
    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       return super.onCreateView(inflater,container,savedInstanceState);
    }
    public FragmentComponent getFragmentComponent(){
        if (fragmentComponent == null){
            DaggerFragmentComponent.builder().myApplicationComponent(MyApplication.getApplication())
                    .activityMoudle(new ActivityMoudle((BaseActivity) getActivity()))
                    .fragmentModule(new FragmentModule(this))
                    .build();
        }
        return fragmentComponent;
    }

}

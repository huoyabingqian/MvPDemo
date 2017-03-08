package com.example.administrator.mvpdemo.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2017/3/7.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {
}

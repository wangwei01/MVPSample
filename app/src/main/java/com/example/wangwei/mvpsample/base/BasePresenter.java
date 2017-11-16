package com.example.wangwei.mvpsample.base;

/**
 * Created by wangwei on 2017/11/16.
 * 编写一个抽象类吧view和model联系起来方面在presenter中调用
 */

public abstract class BasePresenter<VIEW extends BaseView, MODEL extends BaseModel> {
    protected VIEW view;
    protected MODEL model;

    protected void setUp(VIEW view, MODEL model) {
        this.view = view;
        this.model = model;
    }
}

package com.example.wangwei.mvpsample.presenter;

import com.example.wangwei.mvpsample.BasePresenter;
import com.example.wangwei.mvpsample.model.LoginModel;
import com.example.wangwei.mvpsample.presentation.LoginPresentation;

/**
 * Created by wangwei on 2017/11/16.
 */

public class LoginPresenter extends BasePresenter<LoginPresentation.LoginView, LoginModel> implements LoginPresentation.Presenter{


    public  LoginPresenter(LoginPresentation.LoginView view) {
        setUp(view, new LoginModel());
    }

    /**
     * 下面可以写实现的presenter中得方法方便从model拿数据然后给view交互
     */

    /**
     * 举个例子，那用户的信息
     */
    @Override
    public void getUserInfo() {

        /**
         * 请求过程
         */
        view.showToast();//回调
    }



}

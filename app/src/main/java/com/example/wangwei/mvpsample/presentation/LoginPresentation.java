package com.example.wangwei.mvpsample.presentation;

import com.example.wangwei.mvpsample.base.BaseModel;
import com.example.wangwei.mvpsample.base.BaseView;

/**
 * Created by wangwei on 2017/11/16.
 */

public interface LoginPresentation {

    interface LoginView extends BaseView{
        void showToast();
    }

    interface LoginNeedModel extends BaseModel{

    }


    interface Presenter {
        void getUserInfo();
    }

}

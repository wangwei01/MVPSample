package com.example.wangwei.mvpsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wangwei.mvpsample.presentation.LoginPresentation;
import com.example.wangwei.mvpsample.presenter.LoginPresenter;

/**
 * 例如就是就是简单的写一个登录架构
 */
public class MainActivity extends AppCompatActivity implements LoginPresentation.LoginView {

    LoginPresenter loginPresenter = new LoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter.getUserInfo();//这样就可以拿到数据了
    }

    @Override
    public void showToast() {
        //处理结果
    }
}

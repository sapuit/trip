package com.demo.trip;

import android.os.Bundle;

import com.demo.trip.mvp.MvpActivity;

public class MainActivity extends MvpActivity<MainView, MainPresenter> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

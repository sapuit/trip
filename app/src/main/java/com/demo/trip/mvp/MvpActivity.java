package com.demo.trip.mvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;

public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter>
        extends SuperActivity implements MvpView{

    protected P presenter;

    @SuppressWarnings("unchecked")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);

    }


    @LayoutRes
    protected abstract int getLayout();
}

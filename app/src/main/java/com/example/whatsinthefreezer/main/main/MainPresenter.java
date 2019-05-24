package com.example.whatsinthefreezer.main.main;

import android.util.Log;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }

    @Override
    public void handleButtonClicked(String test) {
        Log.d("BUTTOn", test);
    }
}

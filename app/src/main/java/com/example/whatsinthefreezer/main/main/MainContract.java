package com.example.whatsinthefreezer.main.main;

public interface MainContract {
    interface MvpView{
        void buttonClicked();
    }

    interface Presenter{
        void handleButtonClicked(String test);
    }
}

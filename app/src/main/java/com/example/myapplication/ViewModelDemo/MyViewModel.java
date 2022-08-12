package com.example.myapplication.ViewModelDemo;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private int counter=0;
    public int getCounter(){
        setCounter();

        return counter;
    }
    private void setCounter(){
        counter++;
    }
}

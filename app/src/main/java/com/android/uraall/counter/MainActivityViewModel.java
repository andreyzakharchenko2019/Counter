package com.android.uraall.counter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int count = 1;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public int getDecreasedValue(){
        return --count;
    }

    public int getIncreasedValue(){
        return ++count;
    }

    public int getCurrentValue(){
        return count;
    }

}


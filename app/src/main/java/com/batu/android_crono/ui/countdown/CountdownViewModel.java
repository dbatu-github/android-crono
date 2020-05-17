package com.batu.android_crono.ui.countdown;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CountdownViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CountdownViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is countdown fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
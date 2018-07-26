package com.nvisio.jobfire.androiddatabindingexample.basic_data_binding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class BasicDataModelWithBaseObservable extends BaseObservable {
    private String name;

    public BasicDataModelWithBaseObservable(String name) {
        this.name = name;
    }

    // this "@Bindable" annotation makes it to possible to notify the ui to get the data
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // it notifies the ui to update its value
        // BR.name is a generated class
        notifyPropertyChanged(BR.name);
    }
}

package com.nvisio.jobfire.androiddatabindingexample.counter;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.nvisio.jobfire.androiddatabindingexample.BR;

public class CountModel extends BaseObservable {
    private int count = 0;

    public void increment(){
        setCount(getCount()+1);
    }

    public void decrement(){
        setCount(getCount()-1);
    }

    //this annotation makes it bindable
    @Bindable
    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
        // "notifyPropertyChanged" notifies view which is view in our case, that the property has change so update the view
        notifyPropertyChanged(BR.count);
    }
}

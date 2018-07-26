package com.nvisio.jobfire.androiddatabindingexample.basic_data_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.nvisio.jobfire.androiddatabindingexample.R;
import com.nvisio.jobfire.androiddatabindingexample.basic_data_binding.model.BasicDataModel;
import com.nvisio.jobfire.androiddatabindingexample.databinding.BasicDataActivityBinding;

public class BasicDataBinding extends AppCompatActivity {
    // basic
    // null safe
    // default value
    // 1 way binding
    // calling method
    // calling method with parameter
    // using baseObserval
    // using Observable
    // bindingAdapter
    BasicDataActivityBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_data_activity);

        binding = DataBindingUtil.setContentView(this,R.layout.basic_data_activity);
        setDataWithoutObservable();

    }

    // Basic without any observable block STARTS
    // if you dont use any observable, then you must call "binding.setter("data")"
    public void ChangeBasic(View view) {
        BasicDataModel model = new BasicDataModel();
        model.setName("Shohel Rana");
        binding.setBasicData(model);
        // the following wont update the ui data
        // BasicDataModel model = new BasicDataModel();
        // model.setName("Shohel Rana");
    }
    private void setDataWithoutObservable(){
        BasicDataModel model = new BasicDataModel();
        model.setName("Shakil Ahmed");
        binding.setBasicData(model);
    }
    // Basic without any observable block ENDS


}

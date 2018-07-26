package com.nvisio.jobfire.androiddatabindingexample.basic_data_binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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

    private void setDataWithoutObservable(){
        BasicDataModel model = new BasicDataModel();
        model.setName("Shakil Ahmed");
        binding.setBasicData(model);
    }
}

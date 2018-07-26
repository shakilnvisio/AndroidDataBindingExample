package com.nvisio.jobfire.androiddatabindingexample.counter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.nvisio.jobfire.androiddatabindingexample.R;
import com.nvisio.jobfire.androiddatabindingexample.databinding.SimpleCounterBinding;

public class SimpleCounterActivity extends AppCompatActivity {
    SimpleCounterBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.simple_counter);
        binding = DataBindingUtil.setContentView(this,R.layout.simple_counter);
        binding.setCounter(new CountModel());
    }
}

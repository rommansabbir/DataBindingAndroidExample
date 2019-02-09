package com.example.databindingandroid.view.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingandroid.R;
import com.example.databindingandroid.databinding.ActivityMainBinding;
import com.example.databindingandroid.model.UserInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //bind the main layout
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //instantiate the UserInfo model with specific data
        UserInfo userInfo = new UserInfo("Romman Sabbir", "123456", "rommansabbir@gmail.com");

        //set the UserInfo to the binder
        activityMainBinding.setUserInfo(userInfo);
    }
}

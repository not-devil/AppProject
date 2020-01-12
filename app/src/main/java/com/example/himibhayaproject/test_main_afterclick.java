package com.example.himibhayaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class test_main_afterclick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main_afterclick);
    }
    public  void start_test(View view)
    {
        Intent intent1 = new Intent(this,test_start_test1.class);
        startActivity(intent1);
    }
}

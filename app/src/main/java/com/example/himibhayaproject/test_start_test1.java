package com.example.himibhayaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class test_start_test1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_start_test1);
    }
    public  void test_start1(View view)
    {
        Intent start = new Intent(this,start_test1.class);
        startActivity(start);
    }
}

package com.example.oct11fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void one(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

    }
    public void two(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    }
    public void three(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    }
}
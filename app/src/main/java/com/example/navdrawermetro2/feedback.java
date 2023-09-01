package com.example.navdrawermetro2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
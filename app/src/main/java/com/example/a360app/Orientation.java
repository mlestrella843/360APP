package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Orientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
    }

    public void goToOrientationNext(View view)
    {
        Intent btnGoToOrientationNext = new Intent(this,Orientation_next.class);
        startActivity(btnGoToOrientationNext);
    }
}
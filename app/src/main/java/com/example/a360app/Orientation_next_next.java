package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Orientation_next_next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_next_next);
    }
    public void goToOrientationNextNextNext(View view)
    {
        Intent btnGoToOrientationNextNextNext = new Intent(this,Orientation_next_next_next.class);
        startActivity(btnGoToOrientationNextNextNext);
    }
}
package com.example.a360app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Orientation_next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_next);
    }

    public void goToOrientationNextNext(View view)
    {
        Intent btnGoToOrientationNextNext = new Intent(this,Orientation_next_next.class);
        startActivity(btnGoToOrientationNextNext);
    }
}